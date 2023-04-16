package model;

import model.IStack;
import model.Node;

public class Stack <T> implements IStack<T> {

        private Node<T> first; //Representa el primer elemento de la pila

        @Override
        public boolean isEmpty() {
            if (first == null) {
                return true;
            } else
                return false;
        }

        @Override
        public T top(){ //Me retorna el primer elemento de la pila
            if(!isEmpty()){
                return first.getValue();
            }else {
                return null;
            }

        }

        @Override
        public void push(T obj) {
            Node<T> node = new Node<>(obj); //Añado un nodo que contiene un dato generico a la pila
            node.setNext(first); //El siguiente nodo al nodo entrante es el primero// nodo -> first
            first = node; //El nodo entrante es el primero// first -> Otro nodo random
        }
        @Override
        public T pop() {
            Node<T> node = first; //Como elimino el primer elemento, guardo su nodo en una variable.
            first = first.getNext(); //Cuando reasigno, borro, nada me queda apuntando al nodo que antes era el primero.
            return node.getValue(); //Retorno el valor del nodo que borre (es posible ya que lo guarde en una variable)
        }
    }
