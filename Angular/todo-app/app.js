

var app = angular.module("TodoApp",[]);
app.controller("TodoController",TodoFun);

function TodoFun(){
	this.editshow = true;
	this.tasks = [
					"Learn Java",
					"Learn spring",
					"Learn Hibernate"
				];
	
	this.addTask = function(){
		this.tasks.push(this.task);
		this.task = "";
	};
	
	this.editClick= function(){
		this.editshow = !this.editshow;
	};
};
