package ru.job4j.hashmap;

import ru.job4j.oop.Student;

import java.util.*;
import java.util.function.BiFunction;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        int subjects = 0;
        int score = 0;
        for (Pupil pupil : pupils) {
            for (int i = 0; i < pupils.size(); i++) {
                score += pupil.subjects().get(i).score();
                subjects++;
            }
        }
        return (double) score / subjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int subjects = 0;
            int score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                subjects++;
            }
            Label label = new Label(pupil.name(), (double) score / subjects);
            list.add(label);
        }
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(new Label(entry.getKey(), entry.getValue() / pupils.size()));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            list.add(new Label(pupil.name(), score));
        }
        int maxIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(list.get(maxIndex)) > 0) {
                maxIndex = i;
            }
        }
        return list.get(maxIndex);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > Integer.MIN_VALUE) {
                return new Label(entry.getKey(), entry.getValue());
            }
        }
        return null;
    }
}
