package controller;

import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {

        Aluno andrew = new Aluno();
        Aluno bruno = new Aluno();
        System.out.println(andrew.toString());
        System.out.println(bruno.toString());

        andrew.setId(1);
        andrew.setCpf(555222000);
        andrew.setNome("Andrew");
        andrew.setSobrenome("Campos");
        andrew.setEmail("andrew@mail.com");
        System.out.println(andrew.getId());
        System.out.println(andrew.getCpf());
        System.out.println(andrew.getNome());
        System.out.println(andrew.getSobrenome());
        System.out.println(andrew.getEmail());

        bruno.setId(2);
        bruno.setCpf(777222000);
        bruno.setNome("Bruno");
        bruno.setSobrenome("Campos");
        bruno.setEmail("bruno@mail.com");
        System.out.println(bruno.getId());
        System.out.println(bruno.getCpf());
        System.out.println(bruno.getNome());
        System.out.println(bruno.getSobrenome());
        System.out.println(bruno.getEmail());

        Aluno carlos = new Aluno("Carlos", "Silva", "carlosdasilva@mail.com");
        Aluno diego = new Aluno("Diego", "Oliveira", "diegoli@mail.com");
        carlos.setId(3);
        diego.setId(4);
        System.out.println(carlos.toString());
        System.out.println(diego.toString());

        Aluno eduardo = new Aluno(5, 111222333, "Eduardo", "Pereira","edupereira@mail.com");
        Aluno fernando = new Aluno(6, 444555666, "Fernando", "Jujuba", "fernandojujuba@mail.com");
        System.out.println(eduardo.toString());
        System.out.println(fernando.toString());


        List<Aluno> alunos = new ArrayList<>();
        alunos.add(andrew);
        alunos.add(bruno);
        alunos.add(carlos);
        alunos.add(diego);
        alunos.add(eduardo);
        alunos.add(fernando);
        System.out.println(alunos);

        Optional<Aluno> listaFiltrada =  alunos.stream().filter(c -> c.getId() == 5).findAny();
        System.out.println("\nLista filtrada \n" + listaFiltrada + "\n --------\n");

        alunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("Lista reversa" + alunos + "\n\n");

        Map<Integer, Aluno> alunosMap = new HashMap<>();
        alunosMap.put(andrew.getId(), andrew);
        alunosMap.put(bruno.getId(), bruno);
        alunosMap.put(carlos.getId(), carlos);
        alunosMap.put(diego.getId(), diego);
        alunosMap.put(eduardo.getId(), eduardo);
        alunosMap.put(fernando.getId(),  fernando);

        System.out.println(alunosMap);

        Optional<Aluno> mapFiltrado = alunosMap.values().stream().filter(c -> c.getId() == 5).findAny();
        System.out.println("\n\nMap Filtrado\n" + mapFiltrado + "\n--------");

    }
}
