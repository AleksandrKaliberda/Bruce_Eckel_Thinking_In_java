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