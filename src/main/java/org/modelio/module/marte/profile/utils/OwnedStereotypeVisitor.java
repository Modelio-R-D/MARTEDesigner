package org.modelio.module.marte.profile.utils;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;

@objid ("55df4797-41ea-4bb1-b0c3-92b89399861a")
public class OwnedStereotypeVisitor {
    @objid ("3907eafc-af65-4faf-86a4-0c567b1b8450")
    private HwResourceGetter getter;

    @objid ("75bea517-8c9a-4380-929f-7516361055d7")
    private List<ModelElement> ownedList;

    @objid ("71b7d6e2-333c-4b8a-99e2-4b7c2f8051b1")
    public OwnedStereotypeVisitor() {
    }

    @objid ("9a3ef438-81e7-4816-ad81-ac2e73646981")
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

    @objid ("1a5778ba-2262-4af9-84f2-e04c7f61b40a")
    private class HwResourceGetter extends DefaultModelVisitor {
        @objid ("7e6b2648-fcd7-4295-b10d-08bf066c1bf7")
        public void launchVisit(final Element owner) {
            owner.accept(this);
        }

        @objid ("ad65a90b-7bf8-4b92-82b3-9ac6d9350c33")
        @Override
        public Object visitClassifier(final Classifier owner) {
            ownedList.addAll(owner.getOwnedAttribute());
            ownedList.addAll(owner.getOwnedOperation());
            ownedList.addAll(owner.getOwnedEnd());
            ownedList.addAll(owner.getInternalStructure());
            return 42;
        }

        @objid ("e9dd6552-bcf8-4e87-9230-dfd8152f3d0c")
        public Object visitModelTree(final ModelTree owner) {
            ownedList.addAll(owner.getOwnedElement());
            return 42;
        }

        @objid ("3951f2c5-38b2-49c7-b3f7-30d427b0cfb8")
        @Override
        public Object visitNameSpace(final NameSpace owner) {
            ownedList.addAll(owner.getDeclared());
            ownedList.addAll(owner.getOwnedBehavior());
            return 42;
        }

        @objid ("9a7307f1-7b87-4656-9620-02d4c4d7c967")
        public Object visitOperation(final Operation owner) {
            ownedList.addAll(owner.getOwnedBehavior());
            return 42;
        }

    }

}
