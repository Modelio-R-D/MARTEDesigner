/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwArbiterAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwDMA_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwDMAAttribute extends HwArbiterAttribute {
    public static final String STEREOTYPE_NAME = "HwDMA_Attribute";

    public static final String HWDMA_ATTRIBUTE_DRIVENBY_TAGTYPE = "HwDMA_Attribute_drivenBy";

    public static final String HWDMA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE = "HwDMA_Attribute_elementSize";

    public static final String HWDMA_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Attribute_managedMemories";

    public static final String HWDMA_ATTRIBUTE_NBCHANNELS_TAGTYPE = "HwDMA_Attribute_nbChannels";

    public static final String HWDMA_ATTRIBUTE_TRANSFERWIDTH_TAGTYPE = "HwDMA_Attribute_transferWidth";

    /**
     * Tells whether a {@link HwDMAAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwDMA_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwDMA_Attribute >> then instantiate a {@link HwDMAAttribute} proxy.
     * 
     * @return a {@link HwDMAAttribute} proxy on the created {@link Attribute}.
     */
    public static HwDMAAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAAttribute.STEREOTYPE_NAME);
        return HwDMAAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAAttribute} proxy from a {@link Attribute} stereotyped << HwDMA_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwDMAAttribute} proxy or <i>null</i>.
     */
    public static HwDMAAttribute instantiate(final Attribute obj) {
        return HwDMAAttribute.canInstantiate(obj) ? new HwDMAAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDMAAttribute} proxy from a {@link Attribute} stereotyped << HwDMA_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwDMAAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwDMAAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwDMAAttribute.canInstantiate(obj))
        	return new HwDMAAttribute(obj);
        else
        	throw new IllegalArgumentException("HwDMAAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwDMAAttribute other = (HwDMAAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Attribute_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Attribute_drivenBy() {
        return this.elt.getTagValues(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Attribute_elementSize() {
        return this.elt.getTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Attribute_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Attribute_managedMemories() {
        return this.elt.getTagValues(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Attribute_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Attribute_nbChannels() {
        return this.elt.getTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Attribute_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Attribute_transferWidth() {
        return this.elt.getTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Attribute_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Attribute_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Attribute_elementSize(final String value) {
        this.elt.putTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Attribute_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Attribute_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Attribute_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Attribute_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Attribute_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Attribute_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    protected HwDMAAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDMA_ATTRIBUTE_NBCHANNELS_TAGTYPE_ELT;

        public static TagType HWDMA_ATTRIBUTE_TRANSFERWIDTH_TAGTYPE_ELT;

        public static TagType HWDMA_ATTRIBUTE_DRIVENBY_TAGTYPE_ELT;

        public static TagType HWDMA_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT;

        public static TagType HWDMA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01783c9a-0ccf-11df-8525-001302895b2b");
            HWDMA_ATTRIBUTE_NBCHANNELS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d013f-0ccf-11df-8525-001302895b2b");
            HWDMA_ATTRIBUTE_TRANSFERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d0146-0ccf-11df-8525-001302895b2b");
            HWDMA_ATTRIBUTE_DRIVENBY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d014d-0ccf-11df-8525-001302895b2b");
            HWDMA_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "723b9290-162f-11df-b9be-0014222a9f79");
            HWDMA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d508cb6-92a3-11e0-a69d-0027103f347c");
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
