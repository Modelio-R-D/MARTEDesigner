package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cf49e26e-d668-4fc1-a86c-98ec5ed42e9d")
public class HwDrive_Node extends HwMemory_Node {
    @objid ("013cb09f-a541-408e-8b2f-50cb9140a909")
    public HwDrive_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDRIVE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWDRIVE_CLASSIFIER));
    }

    @objid ("13e54948-8afb-4e91-86ff-6b8745cdc91b")
    public HwDrive_Node(Node element) {
        super(element);
    }

    @objid ("d52d587b-b13a-4af7-a3a2-658abb8e3e4e")
    public String getsectorSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE, this.element);
    }

    @objid ("8e434506-382b-46a5-9fee-9fc3b62efc71")
    public void setsectorSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE, value);
    }

}
