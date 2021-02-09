package org.modelio.module.marte.profile.utils;

import java.util.ArrayList;
import java.util.List;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;

public class OwnedStereotypeVisitor {
    private HwResourceGetter getter;

    private List<ModelElement> ownedList;

    public OwnedStereotypeVisitor() {
    }

    public List<ModelElement> getOwnedStereotypeList(final Element owner, final List<String> stereotypeNames) {
        this.getter = new HwResourceGetter();
        this.ownedList = new ArrayList<>();      
        this.getter.launchVisit(owner);
        
        List<ModelElement> result = new ArrayList<>();
        for (ModelElement element : this.ownedList){
            for (String stereotypeName : stereotypeNames){
                if (element.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                    result.add(element);
                }
            }
        }
        return result;
    }

    private class HwResourceGetter extends DefaultModelVisitor {
        public void launchVisit(final Element owner) {
            owner.accept(this);
        }

        @Override
        public Object visitClassifier(final Classifier owner) {
            ownedList.addAll(owner.getOwnedAttribute());
            ownedList.addAll(owner.getOwnedOperation());
            ownedList.addAll(owner.getOwnedEnd());
            ownedList.addAll(owner.getInternalStructure());
            return 42;
        }

        public Object visitModelTree(final ModelTree owner) {
            ownedList.addAll(owner.getOwnedElement());
            return 42;
        }

        @Override
        public Object visitNameSpace(final NameSpace owner) {
            ownedList.addAll(owner.getDeclared());
            ownedList.addAll(owner.getOwnedBehavior());
            return 42;
        }

        public Object visitOperation(final Operation owner) {
            ownedList.addAll(owner.getOwnedBehavior());
            return 42;
        }

    }

}
