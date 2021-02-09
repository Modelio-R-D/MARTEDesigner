/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwArbiterLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwDMA_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwDMALifeline extends HwArbiterLifeline {
    public static final String STEREOTYPE_NAME = "HwDMA_Lifeline";

    public static final String HWDMA_LIFELINE_DRIVENBY_TAGTYPE = "HwDMA_Lifeline_drivenBy";

    public static final String HWDMA_LIFELINE_ELEMENTSIZE_TAGTYPE = "HwDMA_Lifeline_elementSize";

    public static final String HWDMA_LIFELINE_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Lifeline_managedMemories";

    public static final String HWDMA_LIFELINE_NBCHANNELS_TAGTYPE = "HwDMA_Lifeline_nbChannels";

    public static final String HWDMA_LIFELINE_TRANSFERWIDTH_TAGTYPE = "HwDMA_Lifeline_transferWidth";

    /**
     * Tells whether a {@link HwDMALifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwDMA_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMALifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwDMA_Lifeline >> then instantiate a {@link HwDMALifeline} proxy.
     * 
     * @return a {@link HwDMALifeline} proxy on the created {@link Lifeline}.
     */
    public static HwDMALifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMALifeline.STEREOTYPE_NAME);
        return HwDMALifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwDMALifeline} proxy from a {@link Lifeline} stereotyped << HwDMA_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwDMALifeline} proxy or <i>null</i>.
     */
    public static HwDMALifeline instantiate(final Lifeline obj) {
        return HwDMALifeline.canInstantiate(obj) ? new HwDMALifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDMALifeline} proxy from a {@link Lifeline} stereotyped << HwDMA_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwDMALifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwDMALifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwDMALifeline.canInstantiate(obj))
        	return new HwDMALifeline(obj);
        else
        	throw new IllegalArgumentException("HwDMALifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwDMALifeline other = (HwDMALifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Lifeline_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Lifeline_drivenBy() {
        return this.elt.getTagValues(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Lifeline_elementSize() {
        return this.elt.getTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Lifeline_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Lifeline_managedMemories() {
        return this.elt.getTagValues(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Lifeline_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Lifeline_nbChannels() {
        return this.elt.getTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Lifeline_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Lifeline_transferWidth() {
        return this.elt.getTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Lifeline_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Lifeline_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Lifeline_elementSize(final String value) {
        this.elt.putTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Lifeline_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Lifeline_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Lifeline_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Lifeline_nbChannels(final String value) {
        this.elt.putTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Lifeline_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Lifeline_transferWidth(final String value) {
        this.elt.putTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    protected HwDMALifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDMA_LIFELINE_NBCHANNELS_TAGTYPE_ELT;

        public static TagType HWDMA_LIFELINE_TRANSFERWIDTH_TAGTYPE_ELT;

        public static TagType HWDMA_LIFELINE_DRIVENBY_TAGTYPE_ELT;

        public static TagType HWDMA_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT;

        public static TagType HWDMA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8acc123a-10b2-11df-81d9-0014222a9f79");
            HWDMA_LIFELINE_NBCHANNELS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8acc123d-10b2-11df-81d9-0014222a9f79");
            HWDMA_LIFELINE_TRANSFERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8acc123c-10b2-11df-81d9-0014222a9f79");
            HWDMA_LIFELINE_DRIVENBY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8acc123b-10b2-11df-81d9-0014222a9f79");
            HWDMA_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6cbcebc0-162f-11df-b9be-0014222a9f79");
            HWDMA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a078bc66-92a3-11e0-a69d-0027103f347c");
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
