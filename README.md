# my-data-structure

Data Structure 재구현 하기

## Map

Map 을 재구현하며 클래스에서 사용하는 알고리즘과 코딩 스타일을 익힌다.
기본적인 클래스의 구현 방법을 배울 수 있을 것 같다. 

### (Interface) Map 

Key 와 Value 를 연결해주는 객체로 키를 중복해서 가질 수 없고 각 키는 적어도 하나의 값과 연결될 수 있다.

이미 구현된 Set 과 Collection 을 사용한다. 
조회와 삭제를 포함한 기본적인 기능을 제공해주고 1.8 에서 제공되는 특수한 메서드들이 있다.

사용법에 대해 주석에 자세하게 나와있으므로 한번 일독하기를 권하고 실제 메서드를 구현해보면 FunctionalInterface 의 응용활용방법을
익힐 수 있을 것 같다.

### (Abstract Class) AbstractMap

Map Interface 의 스켈레톤 구현체이다.

대부분의 메서드는 entrySet() 을 활용한 Iterator 클래스를 이용해 구현된다.
그러므로 검색에서 아마도 o(1) 의 효율을 가질 것 이다.
벌크로 추가하거나 삭제할 수 있는 메서드를 제공하지만 기본 추가 메서드는 지원하지 않는다.

키와 값들을 얻을 수 있는 keySet() 과 values() 메서드를 제공하는데 내부적으로 추상화된 AbstractSet 과 AbstractCollection
을 이용해 기능을 재구현하여 entrySet() 에 저장된 정보를 제공해준다.

equals, hashCode, toString 메서드를 재구현하며 우리가 간과하는 기본 메서드에 대해서 어떻게 구현하면 좋을지 생각하게 해준다.

Map Interface 의 Entry Sub Interface 를 구현한 구현체들을 제공하는데 SimpleEntry 와 SimpleImmutableEntry 이다.
이름에서 보는대로 값을 변경할 수 있는지에 따라 구분된다.