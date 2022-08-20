package exam;

public class ex75 {

}
/*
Given the declaration:

@interface Resource {
	String[] value();
}

Examine this code fragment:
/** Loc1**//* class ProcessOrders{...}

Which two annotation may be applied at Loc1 in the code fragment?

A) @Resource()
B) @Resource(value={{}})
C) @Resource
D) @Resource({"Customer1","Customer2"})
E) @Resource("Customer1")


ans:DE
*/

/* 這題也可以這樣寫：
@Resource(value="Customer1")
@Resource(value={"Customer1","Customer2"})
*/