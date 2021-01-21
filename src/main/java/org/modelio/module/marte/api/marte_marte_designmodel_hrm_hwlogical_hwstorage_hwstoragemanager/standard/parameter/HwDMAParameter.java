/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwArbiterParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwDMA_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c8cf301c-3c3b-4b1e-b81f-3c5b63ba57de")
public class HwDMAParameter extends HwArbiterParameter {
    @objid ("a359e6b2-a0d6-4645-8b0b-8019bffc2060")
    public static final String STEREOTYPE_NAME = "HwDMA_Parameter";

    @objid ("574629db-a37a-43fc-887c-6a1eb7d34e32")
    public static final String HWDMA_PARAMETER_DRIVENBY_TAGTYPE = "HwDMA_Parameter_drivenBy";

    @objid ("37317b49-a250-4f17-86f4-9e7b4ce60252")
    public static final String HWDMA_PARAMETER_ELEMENTSIZE_TAGTYPE = "HwDMA_Parameter_elementSize";

    @objid ("eeedfbdc-eecf-42d3-91f4-bed9f1e03718")
    public static final String HWDMA_PARAMETER_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Parameter_managedMemories";

    @objid ("8e37cbfb-9e7e-4ba1-9c60-abfa3d40ad71")
    public static final String HWDMA_PARAMETER_NBCHANNELS_TAGTYPE = "HwDMA_Parameter_nbChannels";

    @objid ("ea5e3e5f-d29d-42e2-a95b-c12a58ecb6f8")
    public static final String HWDMA_PARAMETER_TRANSFERWIDTH_TAGTYPE = "HwDMA_Parameter_transferWidth";

    /**
     * Tells whether a {@link HwDMAParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwDMA_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("45da7d6f-5a4a-45b1-8af0-0733145717d5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwDMA_Parameter >> then instantiate a {@link HwDMAParameter} proxy.
     * 
     * @return a {@link HwDMAParameter} proxy on the created {@link Parameter}.
     */
    @objid ("a60e55cf-483e-4f8a-b022-8bba9bf6375f")
    public static HwDMAParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAParameter.STEREOTYPE_NAME);
        return HwDMAParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAParameter} proxy from a {@link Parameter} stereotyped << HwDMA_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwDMAParameter} proxy or <i>null</i>.
     */
    @objid ("55ef1bab-cb6a-45b3-9aab-e40777c8727a")
    public static HwDMAParameter instantiate(final Parameter obj) {
        return HwDMAParameter.canInstantiate(obj) ? new HwDMAParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDMAParameter} proxy from a {@link Parameter} stereotyped << HwDMA_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwDMAParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1a3c400c-d083-4ff5-a985-c190ee1caafd")
    public static HwDMAParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwDMAParameter.canInstantiate(obj))
        	return new HwDMAParameter(obj);
        else
        	throw new IllegalArgumentException("HwDMAParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("48f4bc45-e19e-4baa-bc08-3c3fcbcb9b9b")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwDMAParameter other = (HwDMAParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("ccf622d1-7041-4d9b-8975-65ea3e6da28c")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Parameter_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d95bcf40-6b2f-4af0-955d-4504e7888d40")
    public List<String> getHwDMA_Parameter_drivenBy() {
        return this.elt.getTagValues(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51970da3-b3e8-4d0a-904d-f363be934523")
    public String getHwDMA_Parameter_elementSize() {
        return this.elt.getTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Parameter_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5aa679da-4241-48d4-9f91-cd1e87ffbd7e")
    public List<String> getHwDMA_Parameter_managedMemories() {
        return this.elt.getTagValues(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Parameter_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1eb4074-a164-40c3-b9c2-a08177d29e8c")
    public String getHwDMA_Parameter_nbChannels() {
        return this.elt.getTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Parameter_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b9df492-412c-4f34-858b-5cf2dfad8e1c")
    public String getHwDMA_Parameter_transferWidth() {
        return this.elt.getTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @objid ("7b2db956-76c4-4b37-bd0f-72fb2967904c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Parameter_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9105f3dd-d4ab-4a99-ab54-a12b7519b861")
    public void setHwDMA_Parameter_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("44fa41eb-bc76-4c0c-b228-7ce92f160529")
    public void setHwDMA_Parameter_elementSize(final String value) {
        this.elt.putTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Parameter_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30e4eb0f-0bea-45c4-b839-1dac7d46974a")
    public void setHwDMA_Parameter_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Parameter_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("316bf82e-ae99-4c34-9ad2-b4656dc2ae38")
    public void setHwDMA_Parameter_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Parameter_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6d814df-2eb9-4830-9f24-f8d850270b54")
    public void setHwDMA_Parameter_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("79f69498-fcd1-4b4d-8ea3-c0e57fa01483")
    protected HwDMAParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("8911fb3c-bd45-494d-bc62-6cd0e5876e6a")
    public static final class MdaTypes {
        @objid ("3c69bd49-9fc0-43cf-95bd-ce53f3e17143")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("69cb1609-d2ba-4a30-bb84-34b850b6651f")
        public static TagType HWDMA_PARAMETER_NBCHANNELS_TAGTYPE_ELT;

        @objid ("418afcdd-a3b5-486c-8a2c-de3458f4df63")
        public static TagType HWDMA_PARAMETER_TRANSFERWIDTH_TAGTYPE_ELT;

        @objid ("7e285f27-7851-4a99-92c0-c67bfcc9fe74")
        public static TagType HWDMA_PARAMETER_DRIVENBY_TAGTYPE_ELT;

        @objid ("0831f924-a558-4eaf-9631-2dbbe3f2407c")
        public static TagType HWDMA_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("9277e930-0ea6-46f0-8a9e-66ee8f905f79")
        public static TagType HWDMA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("0170672b-d279-4ff3-94a6-52a3f919f088")
        private static Stereotype MDAASSOCDEP;

        @objid ("25f920a0-8431-42e8-ba66-c3f36b190534")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28d0625b-1a81-440d-9405-a788f300f9fa")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0175da46-0ccf-11df-8525-001302895b2b");
            HWDMA_PARAMETER_NBCHANNELS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d013c-0ccf-11df-8525-001302895b2b");
            HWDMA_PARAMETER_TRANSFERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d0143-0ccf-11df-8525-001302895b2b");
            HWDMA_PARAMETER_DRIVENBY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d014a-0ccf-11df-8525-001302895b2b");
            HWDMA_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bb801ae1-1728-11df-b92a-0014222a9f79");
            HWDMA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a2af32e6-92a3-11e0-a69d-0027103f347c");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
