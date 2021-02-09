/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class HwDMAParameter extends HwArbiterParameter {
    public static final String STEREOTYPE_NAME = "HwDMA_Parameter";

    public static final String HWDMA_PARAMETER_DRIVENBY_TAGTYPE = "HwDMA_Parameter_drivenBy";

    public static final String HWDMA_PARAMETER_ELEMENTSIZE_TAGTYPE = "HwDMA_Parameter_elementSize";

    public static final String HWDMA_PARAMETER_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Parameter_managedMemories";

    public static final String HWDMA_PARAMETER_NBCHANNELS_TAGTYPE = "HwDMA_Parameter_nbChannels";

    public static final String HWDMA_PARAMETER_TRANSFERWIDTH_TAGTYPE = "HwDMA_Parameter_transferWidth";

    /**
     * Tells whether a {@link HwDMAParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwDMA_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwDMA_Parameter >> then instantiate a {@link HwDMAParameter} proxy.
     * 
     * @return a {@link HwDMAParameter} proxy on the created {@link Parameter}.
     */
    public static HwDMAParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAParameter.STEREOTYPE_NAME);
        return HwDMAParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAParameter} proxy from a {@link Parameter} stereotyped << HwDMA_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwDMAParameter} proxy or <i>null</i>.
     */
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
    public static HwDMAParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwDMAParameter.canInstantiate(obj))
        	return new HwDMAParameter(obj);
        else
        	throw new IllegalArgumentException("HwDMAParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Parameter_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Parameter_drivenBy() {
        return this.elt.getTagValues(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Parameter_elementSize() {
        return this.elt.getTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Parameter_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Parameter_managedMemories() {
        return this.elt.getTagValues(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Parameter_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Parameter_nbChannels() {
        return this.elt.getTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Parameter_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Parameter_transferWidth() {
        return this.elt.getTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Parameter_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Parameter_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Parameter_elementSize(final String value) {
        this.elt.putTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Parameter_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Parameter_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Parameter_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Parameter_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Parameter_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Parameter_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAParameter.MdaTypes.HWDMA_PARAMETER_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    protected HwDMAParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDMA_PARAMETER_NBCHANNELS_TAGTYPE_ELT;

        public static TagType HWDMA_PARAMETER_TRANSFERWIDTH_TAGTYPE_ELT;

        public static TagType HWDMA_PARAMETER_DRIVENBY_TAGTYPE_ELT;

        public static TagType HWDMA_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT;

        public static TagType HWDMA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
