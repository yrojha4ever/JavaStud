class Thing {
    String name

    Thing(String name){
        setName(name)
    }
}
//--------------
void sayHello(){
    println "hello"
}

sayHello()
//---------Script Binding(this)--
name = "foo"
println name
//------optional return statement if last line-----
int doublex(int i){
    i * 2
}
assert doublex(2) == 4
/**
 * Tyeps:
 * Groovy is optionally types. variables, params, and returne values can be types or untyped.
 * Typed: int i = 1
 * UnTyped: def i = 1  (def synonymous to Object)
 */
def i = 1
println i
//------Type Safety: is enforced at runtime not compile time like Java
Integer doubleIt(Integer i){
    i * 2
}
println doubleIt(9)
//doubleIt("abc") //RuntimeException
/**
 * Optional Parenthesis:
 * When calling a method, the () are optional.
 */
void someMethod(arg1, arg2){
    println arg1+arg2
}
someMethod(1, 2)
someMethod 1, 2
/**
 * Strings: There is no character literal, strings can be double or single quote.
 */
def s1 = "a string"
def s2 = 'a string'
def s3 = """
string
on multiple
lines
"""
println s3
/**
 * Groovy Strings(GStrings)
 * Groovy supports string interpolation
 */
def i2 = 2
println "i is $i2"

def name2 = "gradle"
println "Training: ${name.toUpperCase()}" //Gstrings use double quote, single quote are different
println 'Training: ${name.toUpperCase()}' //It show: Training: ${name.toUpperCase()}

/**
 * Properties:
 * Groovy Introduces the concept of properties.
 */
//thing.name = "bar"
//println thing.name

Map m = new HashMap()
m.put("foo", "bar")
//m.get("foo") == bar

m.foo = "baz"
m.foo == "baz"

/**
 * Colsures
 * Closures are like function pointers, lamdas, annonymous classes etc
 * They are declared with {}
 */
def sayIt = {
    it ->
        println it
}
sayIt("I am ppointer function :)")

def doubleIt2 = {
    it * 2
}
doubleIt2(2) == 4

//Closure as Parameter: special syntax for closure as the last parameter.
def oneArgMethod(closure){
    closure() * 2
}
def twoArgMethod(factor, closure){
    closure() * factore
}

println oneArgMethod({3}) //6
println oneArgMethod {3} //6

//twoArgMethod(3, {3}) == 9
//println twoArgMethod(3) {3} //9
//println twoArgMethod 3, {3} //9

//Multi-line closures
def doubleIt3(closure){
    closure() * 2
}
def ix = doubleIt3 {
    def ii = 3
    ii* 2
}
assert ix == 12

/**
 * Common closure use
 */
[1, 2, 3].each {
    println it
}

for(int iy in [1, 2, 3]){
    println iy
}



//PART 2
/**
 * Closure symbol resolution
 * closure bodies access: lexical scope + instance scope
 */
class Thing {
    String name = "fred"
    Closure nameSayer = {
        println name
    }
}

def thing = new Thing()
thing.nameSayer() //fred

//Closure take references
def name = "John"
def sayName = {
    println name
}
name = "Fred"
sayName() //Fred

/**
 * Delegate: Very imp concept
 * You can inflence how a closure resolves symbols, by changing its delegate.
 * This feature came in java8 with Functional interface( <= 7 : It's called anonymous inner classes.)
 */
class Person {
    String name2
    def executeInside(Closure c){
        //c.resolveStrategy = Closure.OWNER_FIRST //(groovey default: first)
        //c.resolveStrategy = Closure.DELEGATE_FIRST //(gradle default: first)
        c.delegate = this
        c()
    }
}
def person = new Person(name2 : "John")
person.executeInside { println "Delegate Imp: "+ name2 } //Delegate Imp: John

/**
 * Closure scope access
 * You can explicitely access the different scopes:
 */
/*def person2 = new Person(name2 : "John")
def name2 ="HELLO"
person2.executeInside{
    println "owner: $owner.name2 (${owner.getClass()})" //owner: Fred(class ideaGroovyConsole)
    println "delegate: $delegate.name2 (${delegate.getClass()})" //delegate: John(class Person)
}*/

/**
 * Dynamism: Monkey Patching (Not recomanded in gradle)
 * YOu can add behaviour and functionality at runtime.
 */
class Echoer {
    def echo(Integer i){
        println i
    }
}
Echoer.metaClass.ekko = {Integer i -> println i}
def echoer = new Echoer()
echoer.echo(1)
echoer.ekko(11)

/**
 * Dynamic Methods: groovy call special method called: methodMissing once it does not find method calling
 */
class Shouter{
    def methodMissing(String name, args){
        println name.toUpperCase()
    }
}
def shouter = new Shouter();
shouter.iWillBeShouted() //IWILLBESHOUTED
shouter.fooBar("something") //FOOBAR
shouter.getClass() //Result: class Shouter

/**
 * Builders
 * Using a dynamic API to build a data structure is very common in Groovy.
 * Ex: MarkupBuilder
 */
/*def builder = new MarkupBuilder()
builder.html {
    head { title 'Simple document' }
    body(id: 'main') {
        h1 'Building HTML the Groovy Way'
        p {
            ul {
                li "second item"
            }
        }
        a href : 'more.html', 'Read more...'
    }
}*/

/**
 * Dynamic Method Names
 * Even method names can  be dynamic.
 * You might expose yaml, xml file and
 */
class Hello {
    def helloJohn(){
        println "Hello John!"
    }
}

def namee = "John"
new Hello()."hello$namee"() //Hello John!

/**
 * Lists , Maps
 * Groovy provides syntatic sugar for dealing with maps.
 */
def numbers = [1, 2, 3]
println numbers //[1, 2, 3]
println numbers.getClass() //class java.util.ArrayList
println numbers.size() //3
println numbers[0] //1
println numbers[1] //2

numbers << 4
println numbers //[1, 2, 3, 4]
numbers[0] = 10
println numbers //[10, 2, 3, 4]

//Map
def stats = [age: 20, name: "John Smith"]
println stats //[age: 20, name: "John Smith"]
println stats.getClass() //class java.util.LinkedHashMap
println stats.size() //2

println stats.age //20
println stats["age"] //20

stats.gender = "Male"
println stats //[age:20, name:John Smith, gender:Male]
stats["gender"] = "?"
println stats //[age:20, name:John Smith, gender:?]

//Named Parameter
def sayIt(Map attributes){
    println "It's name is: $attributes.name"
    println "Its age is: $attributes.age"
}
sayIt(name:"John", age: 12)

//<< The named parameter map is always the first parameter in the list. >>
def sayIt2(Map attributes, String name){
    println "---------\nIts name is: $name"
    println "Its age is: $attributes.age"
    println "Its gender is: $attributes.gender"
}
sayIt2("John", age: 12, gender: "Male")
sayIt2(age: 12, gender: "Male", "John")
sayIt2(gender:"Male", "John", age: 12)
println "\n------------"
/**
 * The GDK
 * Groovy adds new behaviour to the core JDK types to make them more groovy
 * Not just collections, but they are most "Popular"
 */
[1, [2,3]].flatten() //[1,2,3]
['a','b'].each {item -> println item} //a,  b
['a','b'].collect {it + '1' } //[a1,b1]
['a','b','c'].findAll {it != 'c'  } //['a','b']
[1,2,3].every {it < 3} //False
[1,2,3].any {it < 3} //true

//PART 3:
/**
 * Operator : overloading and adds some new one
 * 1. Have a look at http://groovy.codehaus.org/Operators
 * 2. What do the following operators do?
 * ?.
 * ?:
 * is
 */
def l = []
l << 0
l << 1
l << 2
assert l.size() == 3

/**
if(a != null){
    a.foo()
}

a?.foo()
c = a ? a : b
c = a?:b

a == b
a.equals(b)
a.is(b)
*/

/**
 * 1. Write each name to file "attendees.txt"
 * 2. Read file and wirte in order of length and in uppercase
 * 3. Hint: Find GDK methods for File ID and for sorting collections.
 */
def names = ["Jaron", "Dylan", "Christopher", "John", "Kenneth", "Tom"]
/*def f = new File("attendees.txt")

f.text = names.sort().join("\n")

f.readLines().sort( {a, b -> a.length <=> b.length} )
f.readLines().sort{it.length}.each{println it.toUpperCase()}*/

//Implement your own version of Groovy's collect() method
List<?> myCollect(Iterable<?> things, Closure<?> transform){
    def list = []
    things.each {list << transform(it)}
    list
}

def doubled = myCollect([1, 2, 3]) {
    it * 2
}

println doubled //[2, 4, 6]
assert doubled == [2, 4, 6]

//#####################################################################
//-------Groovy for Java Developer by: Peter Ledbrook, SpringDeveloper
(0..<10).collect {2 ** it} //[1, 2, 4, 8, 16, 32, 64, 128, 256, 512]

(0..<10).collect {2 ** it}.forEach {println it}
(0..<10).stream().map {2 ** it}.forEach{println it}
(0..<10).stream().map {i -> 2 ** i}.forEach{println it}
(0..<10).stream().map {int i -> 2 ** i}.forEach{println it}
//1
//2
//4
//8
//16
//32
//64
//128
//256
//512

//---Introduction to Groovy by Daniel Lew
//---Gradle Summit: Groovy for Gradle
