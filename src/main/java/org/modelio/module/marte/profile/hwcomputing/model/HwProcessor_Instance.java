package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9879683a-53b8-459c-ba99-9039c28373fb")
public class HwProcessor_Instance extends HwComputingResource_Instance {
    @objid ("80988768-e377-4348-8411-a7e553811f69")
    public HwProcessor_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwProcessor_Instance"));
    }

    @objid ("ce54db68-da26-455b-bfd6-1ae8e1b9b22b")
    public HwProcessor_Instance(Instance element) {
        super(element);
    }

    @objid ("1856c6be-6ebc-4a6e-94ba-175d2b4a0561")
    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_ARCHITECTURE, this.element);
    }

    @objid ("38797751-30e1-45a3-bc1f-2510aa5de0fa")
    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_ARCHITECTURE, value);
    }

    @objid ("72d7da3e-cdef-49df-b223-456abb607006")
    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_MIPS, this.element);
    }

    @objid ("de06852c-636e-4c45-9ccf-286b8e4c99e8")
    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_MIPS, value);
    }

    @objid ("08798742-2416-4ff1-b35c-11bd2aa3c430")
    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_IPC, this.element);
    }

    @objid ("23aec5a0-ef74-45bc-ac66-1d036365b583")
    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_IPC, value);
    }

    @objid ("5626bce3-464a-446f-aa41-36c951360fe2")
    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBCORES, this.element);
    }

    @objid ("3a181823-e19c-4182-8cca-3aa0c9896c75")
    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBCORES, value);
    }

    @objid ("20745788-65c2-4091-972a-63e19f6c361f")
    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBPIPELINES, this.element);
    }

    @objid ("a5ca2bd4-1443-4e49-9f6f-64a9fe0ebc2c")
    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBPIPELINES, value);
    }

    @objid ("cb881f67-0c67-485d-bdcc-d38e98160f5a")
    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBSTAGES, this.element);
    }

    @objid ("f089721b-475b-4925-8c05-d5c37092dfe9")
    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBSTAGES, value);
    }

    @objid ("38dd7794-90e2-47fc-bf00-bebef96ef720")
    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBALUS, this.element);
    }

    @objid ("27a1f8be-9d29-475e-ad36-5ed096f18e0d")
    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBALUS, value);
    }

    @objid ("ed217014-c66a-4037-b194-38fef01a9584")
    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBFPUS, this.element);
    }

    @objid ("b0eb6795-d5b1-4fdc-a5c2-cc9cda425f65")
    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBFPUS, value);
    }

}
