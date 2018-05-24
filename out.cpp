#include "Variable.cpp"

Variable _nazwa_funkcji(Variable _arg0, Variable _arg1){
	_dzialanie1(  );
	Variable _zm1 = 1;
	_dzialanie2(  );
	return _zm1;
}

Variable _zm_gl = 2;
_zm_gl = 3.43;
Variable _funkcja2(Variable _r){
	_zm_gl(  );
	Variable _zm_gl = 4;
	Variable _r = 1+2*(5/6)-4;
	Variable _obw = (3.14*_r)*_r;
		if( _obw>2*3.14*_r){
			_print( "jest wieksze" );
		}
		else if( _r>5){
				if( 2<3){
					_print( "tak", _nie );
				}
				else if( 1){
					_print( "nie" );
				}
		}
		else if( 1){
			_print( "jest mniejsze" );
		}
	return 	_zrob_costam( 4 );
}

Variable _silnia(Variable _N){
	Variable _zwroc = 0;
		if( _N>=1){
			_zwroc = 1;
		}
		else if( 1){
			_zwroc = _N*(_silnia( (_N-1) ));
		}
	return _zwroc;
}

Variable _zmienna_globalna = 7;
int main(){
	Variable _wynik = _nazwa_funkcji( _arg0, (_arg1+2) );
	_wynik = _wynik/(3+1);
	_print( _wynik );
	_funkcja( _arg0, _arg1, _arg2 );
	NULL;
return 0;
}

Variable _tab = 123;
Variable _fr = _first( _tab );
_tab = 1"costam"565.6;
Variable _nth_elem = _nth( _tab, 4 );
