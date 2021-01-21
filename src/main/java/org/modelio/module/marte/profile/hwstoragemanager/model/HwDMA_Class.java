package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwArbiter_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b45494ee-1cb0-4b15-b0e9-9a10c6a1f006")
public class HwDMA_Class extends HwArbiter_Class {
    @objid ("443e6698-0898-4e38-9625-6c4287825908")
    public HwDMA_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDMA_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWDMA_CLASSIFIER));
    }

    @objid ("328b5fb8-76c5-49a5-a38f-b7e1d81fbb27")
    public HwDMA_Class(Class element) {
        super(element);
    }

    @objid ("b77f4bc6-3a19-41f1-83ed-d74df786f9cf")
    public String getnbChannels() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_NBCHANNELS, this.element);
    }

    @objid ("0f05ed1f-d78b-47d7-bd36-38fe5443f0f6")
    public void setnbChannels(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_NBCHANNELS, value);
    }

    @objid ("a3441944-ca6a-4d56-a487-debe4c17381a")
    public String gettransferWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_TRANSFERWIDTH, this.element);
    }

    @objid ("d7e28b35-eafb-4d7d-a366-b7931c39eaa9")
    public void settransferWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_TRANSFERWIDTH, value);
    }

    @objid ("c73918d4-7ead-4560-bc1a-0dba27a01413")
    public String getdrivenBy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_DRIVENBY, this.element);
    }

    @objid ("4f17dabd-528f-4bf9-b90c-70acdfaf773c")
    public void setdrivenBy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_DRIVENBY, value);
    }

    @objid ("6ca51549-e914-4ead-a6ed-389f075ccf84")
    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_MANAGEDMEMORIES, this.element);
    }

    @objid ("ff5dcbcd-f93f-45cd-8888-fb1cd10a0247")
    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_MANAGEDMEMORIES, value);
    }

}
