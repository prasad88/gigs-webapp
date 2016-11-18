var app = angular.module('myapp', []);
app.controller('bodyController', function($scope,$http) {
	$scope.myname="Prasad";
	$scope.myfunction=function(){
		$scope.myname="newname";
	};
	$scope.getJobService= function(){
		$http.get("/getlist")
		.then(function(response){
			$scope.jobs=response.data;
		},function(response){
			console.log("Job creation failed");
		});
	};
	$scope.createnewjob = function(){
		$http.post("/jobs/createjob",$scope.newjob)
		.then(function(response){
			console.log("Job created " +response.status);
		},function(response){
			console.log("Job creation failed");
		});
		
	};
	
});