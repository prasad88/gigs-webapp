var app = angular.module("myApp", []);
	app.controller("MyController",TimeFun);
	
	function TimeFun($scope){
	
		var currTime = new Date();
		$scope.PageTime = currTime.toTimeString();
		$scope.updateTime = function(){
			var currTime = new Date();
		    $scope.PageTime = currTime.toTimeString();
			console.log($scope.userName);
			alert($scope.userName);
			
			
		};
		
	};