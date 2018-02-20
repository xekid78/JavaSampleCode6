# JavaWhileStatement
while文

<dl>処理
  <dt>ケース１</dt>
  <dd>１～５の数字を昇順に「**だよ。」と出力する。</dd>
  <dt>ケース２</dt>
  <dd>１～５の数字を降順に「**だよ。」と出力する。</dd>
</dl>

## コード
```
public class sample6 {

	public static void main(String[] args) {
		System.out.println("** ケース１ **");
		int i = 1;
		while (i <= 5) {
			System.out.println(i + "だよ。");
			i += 1;
		}
		System.out.println("");

		System.out.println("** ケース２ **");
		int j = 5;
		while (j > 0) {
			System.out.println(j + "だよ。");
			j -= 1;
		}
	}

}
```

## 出力結果
```
** ケース１ **  
1だよ。  
2だよ。  
3だよ。  
4だよ。  
5だよ。  
  
** ケース２ **  
5だよ。  
4だよ。  
3だよ。  
2だよ。  
1だよ。  
```

## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
