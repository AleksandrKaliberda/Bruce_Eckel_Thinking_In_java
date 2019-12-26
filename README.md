# Bruce_Eckel_Thinking_In_java

Git commands
*	*	*	*	*	*	*	*	*	*	
//To look which branches i have
$ git branch
Output:
  dev
  master
*	*	*	*	*	*	*	*	*	*	
//To create new branch named "dev"
$ git branch dev
*	*	*	*	*	*	*	*	*	*	
//To change branch to desired one
$ git checkout BE_08_constructors_and_polymorphism
Output:
Switched to branch 'BE_08_constructors_and_polymorphism'
*	*	*	*	*	*	*	*	*	*	
//To add revised files
$ git add README.md
*	*	*	*	*	*	*	*	*	*	
//To commit files
$ git commit -m 'revision in dev'
Output:
[dev 4ec0b43] revision in dev
 1 file changed, 1 insertion(+)
*	*	*	*	*	*	*	*	*	*	
//To see commit logs
$git log
*	*	*	*	*	*	*	*	*	*	
//To merge branch BE_08_constructors_and_polymorphism into branch dev, need to:
//1. Checkout branch dev first ($ git checkout dev)
//2. Merge branch BE_08_constructors_and_polymorphism ($ git merge BE_08_constructors_and_polymorphism)

sasha@sasha-pc MINGW64 /c/sjava/Bruce_Eckel_Thinking_In_java/Bruce_Eckel_Thinking_In_java (BE_08_constructors_and_polymorphism)
$ git checkout dev
Switched to branch 'dev'

sasha@sasha-pc MINGW64 /c/sjava/Bruce_Eckel_Thinking_In_java/Bruce_Eckel_Thinking_In_java (dev)
$ git merge BE_08_constructors_and_polymorphism
Merge made by the 'recursive' strategy.
 .../order_of_constructor_calls/Main.java           | 66 ++++++++++++++++++++++
 1 file changed, 66 insertions(+)
 create mode 100644 src/_08_polymorphism/constructors_and_polymorphism/order_of_constructor_calls/Main.java
*	*	*	*	*	*	*	*	*	*
//To push branch dev, which was not created at that time, i used command ($ git push --set-upstream origin dev)
sasha@sasha-pc MINGW64 /c/sjava/Bruce_Eckel_Thinking_In_java/Bruce_Eckel_Thinking_In_java (dev)
$ git push --set-upstream origin dev
Enumerating objects: 20, done.
Counting objects: 100% (20/20), done.
Delta compression using up to 4 threads
Compressing objects: 100% (16/16), done.
Writing objects: 100% (18/18), 2.44 KiB | 499.00 KiB/s, done.
Total 18 (delta 4), reused 0 (delta 0)
remote: Resolving deltas: 100% (4/4), completed with 1 local object.
remote:
remote: Create a pull request for 'dev' on GitHub by visiting:
remote:      https://github.com/AleksandrKaliberda/Bruce_Eckel_Thinking_In_java/pull/new/dev
remote:
To https://github.com/AleksandrKaliberda/Bruce_Eckel_Thinking_In_java.git
 * [new branch]      dev -> dev
Branch 'dev' set up to track remote branch 'dev' from 'origin'.
	