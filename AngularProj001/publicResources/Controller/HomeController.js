var workers =[
    {name:"osama mohsen",job:"engineer"},
    {name:"ahmed mostafa",job:"techniqual support"},
    {name:"ahmed mahmoud",job:"coffe shop"},
    {name:"Fawze lux",job:"worker"}
];

MyHomeApp.controller( 'HomeCtrl', function ( $scope ) {
    $scope.workers = workers;
});