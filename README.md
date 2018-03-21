# JavaWhileStatement
while文

## 処理
<dl>
  <dt>ケース１</dt>
  <dd>１～５の数字を昇順に「**だよ。」と出力する。</dd>
  <dt>ケース２</dt>
  <dd>１～５の数字を降順に「**だよ。」と出力する。</dd>
</dl>

## コード
```
public class While {

	public static void main(String[] args) {
		System.out.println("** ケース１ **");
		int i = 1;
		while (i <= 5) {
			System.out.println(i + "だよ。");
			i++;
		}
		System.out.println("");

		System.out.println("** ケース２ **");
		i = 5;
		while (i > 0) {
			System.out.println(i + "だよ。");
			i--;
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
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
