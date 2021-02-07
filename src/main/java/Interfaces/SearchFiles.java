package Interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

/**
 * Данный интерфейс хранит метод для поиска в указанной директории файлов
 * и сохранения их в HashMap. В качестве @key записывается контрольная сумма
 * @value список файлов с контрольной суммой.
 */
public interface SearchFiles {
    void fillHashMap(Map<String, List<String>> filesList, File directory) throws FileNotFoundException;
    List<String> deleteFilesWithDifferentSize(Map<String, List<String>> filesList) throws IOException;
    void removeAlone(Map<String, List<String>> filesList);
    List<String> filterHashSum(List<String> newList) throws IOException, NoSuchAlgorithmException;
}
