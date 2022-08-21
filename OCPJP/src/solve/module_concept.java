package solve;

public class module_concept {

}
/*
What statement are true about requires mandated java.base?(Choose two)
A. This output is expected when running the java --list--modules command.
B. This output is expected when running the java --show--module-resolution
   command	
C. This output is expected when running the jdeps command
D. This output is expected when running the jmod command
E. All modules will include this in the output
F. Some modules will include this in the output

ans:CE
*/

//---------------------------------------------------------------//

/*
 *  jdeps : You use the jdeps command to launch the Java class dependency analyzer.
 *  jmod : create JMOD files and list the content of existing JMOD files.
 * 
 */

/*
What is the name of a file that declares a module?

A. mod.java
B. mod-data.java
C. mod-info.java
D. module.java
E. module-data.java
F. module-info.java

ans:F


*/
//---------------------------------------------------------------//
/*
Suppose you have a module that contains a class with a call to
exports(ChocolateLab.class) . Which part of the module service contains this class?
A. Consumer
B. Service locator
C. Service provider
D. Service provider interface
E. None of the above


ans:E

*/
/*
 
  private static ServiceLoader<CodecSet> codecSetLoader
  								= ServiceLoader.load(CodecSet.class);

 */


//---------------------------------------------------------------//

/*
How many of these keywords can be used in a module-info.java file:close,export,
export,require,and uses?

A. None
B. One
C. Two
D. Three
E. Four
F. Five



ans:B

open ,opens ,module ,requires ,transitive ,exports
to ,uses ,provides ,with


*/

//---------------------------------------------------------------//

/*
Which module defaults the foundational APIs of the Java SE Platform?

A) java.lang
B) java.base
C) java.object
D) java.se

ans:B

*/
