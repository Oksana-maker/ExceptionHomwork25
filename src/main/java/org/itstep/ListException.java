package org.itstep;

 class ListException extends Exception {

}
class EmptyListException extends ListException{
 public EmptyListException(String massage) {
  System.out.println(massage);
 }
}
class FullListException extends ListException{
 public FullListException(String massage) {
  System.out.println(massage);
 }
}