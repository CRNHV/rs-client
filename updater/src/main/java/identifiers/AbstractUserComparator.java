package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(User.class)
public class AbstractUserComparator extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isAbstract() &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/util/Comparator")) &&
                classNode.getInstanceMethods().stream()
                        .map(methodNode -> Type.getArgumentTypes(methodNode.desc))
                        .filter(types -> types.length >= 2)
                        .anyMatch(types ->
                                types[0].equals(TypeUtilities.getTypeOfIdentifiedClass("User")) &&
                                        types[1].equals(TypeUtilities.getTypeOfIdentifiedClass("User")));
    }
}
