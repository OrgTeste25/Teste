#include<stdlib.h>
#include<stdio.h>
#include<dos.h>
#include<string.h>

struct caixa {
int valor;
//struct caixa *prox; //esta criando uma estrutura caixa dentro da estrutura caixa e é o endereço de outra caixa
caixa *prox;
};

struct caixa c1, c2, c3, raiz, *inicio, *fim, *aux, *cx;
  //      endereços      //
 
char texto[4096], *txt; //endereço de 1 texto
int *vinteiro; //endereço de 1 int
float *vfloat; //endereço de 1 float

int main(int q, char *t[])
{
vinteiro = new int;
*vinteiro = 1000; //PRECISA do *
//memória dinâmica, pegou qlqr lugar
//4 bites

vfloat = new float;
*vfloat = 27.5;
//8 bites

printf("\n END=%u, endereco=%u valor = %d", &vinteiro, vinteiro, *vinteiro);
                                    // &vinteiro = endereço dela,
//  vinteiro = endereço dentro dela
// *vinteiro = valor armazendo nela

printf("\n END=%u, endereco=%u valor = %f",&vfloat, vfloat, *vfloat);

c1.valor=10;//não precisa de new, pq não tem *
c1.prox=NULL;
inicio=&c1;
fim = &c1;

c2.valor=20;//não precisa de new, pq não tem *
c1.prox=&c2; //c1->c2
c2.prox=NULL;
fim=&c2;

c3.valor=33;//não precisa de new, pq não tem *
c2.prox=&c3; //c1->c2->c3
c3.prox=NULL;
fim=&c3;

aux=inicio;

//inicio->c1->c2->c3->fim
//aux
//  aux
//  aux
while(1)
{
printf("\n endereco=%u valor=%d",aux, aux->valor);
aux = aux->prox;
if(aux==NULL) break;
}
}
