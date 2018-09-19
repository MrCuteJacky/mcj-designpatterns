## 單例模式(Singleton pattern)
顧名思義，一個類別只會有一個實例，同時供全域使用。主要是為了進行記憶體控制，或者縮減重複實例化的時間，而產生的設計。
### 實際案例
資料庫連線，因為太常需要被使用，可以透過此設計模式，降低重複連線的記憶體及時間浪費。
### 設計重點
- 將建構子指定為私有的。
- 必須宣告一個靜態變數，放被實例的物件。
- 必須讓使用者可以取得此實例。
- 因為是單一實例，因此在設計時，必須特別小心處理執行緒安全(Thread-safe)。
### Sample 1
```
/**
 * Singleton1.
 * 
 * @author MrCuteJacky
 * @version 1.0
 */
public class Singleton1 {
	
	/** The instance. */
	public final static Singleton1 instance = new Singleton1();
	
	/**
	 * Constructor.
	 */
	private Singleton1() {
	}

}
```
### Sample 2
```
/**
 * Singleton2.
 * 
 * @author MrCuteJacky
 * @version 1.0
 */
public class Singleton2 {
	
	/** The instance. */
	private static Singleton2 instance;

	/**
	 * Constructor.
	 */
	private Singleton2() {
	}
	
	/**
	 * getInstance.
	 * 
	 * @return
	 */
	public static Singleton2 getInstance() {
		
		if (instance == null) {
			instance();
		}
		
		return instance;
	}
	
	/**
	 * instance.
	 */
	private static synchronized void instance() {
		
		if (instance == null) {
			instance = new Singleton2();
		}
	}

}
```
