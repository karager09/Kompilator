#include "Variable.cpp"

Variable _silnia(Variable _N){
	Variable _x = Variable(0);
		if( _N>Variable(0)){
			_x = _N*(_silnia( (_N-Variable(1)) ));
		}
		else if( 1){
			_x = Variable(1);
		}
	return _x;
}

Variable _sum(Variable _a1, Variable _a2){
	return 	_a1+_a2;
}

int main(){
	cout << (_sum( Variable(2), Variable(3) ))<< Variable("\n");
	cout << (_silnia( (_sum( Variable(2), Variable(3) )) ));
return 0;
}

