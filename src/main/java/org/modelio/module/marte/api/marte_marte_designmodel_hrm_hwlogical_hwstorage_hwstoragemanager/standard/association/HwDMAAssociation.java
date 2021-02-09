/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwArbiterAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwDMA_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwDMAAssociation extends HwArbiterAssociation {
    public static final String STEREOTYPE_NAME = "HwDMA_Association";

    public static final String HWDMA_ASSOCIATION_DRIVENBY_TAGTYPE = "HwDMA_Association_drivenBy";

    public static final String HWDMA_ASSOCIATION_ELEMENTSIZE_TAGTYPE = "HwDMA_Association_elementSize";

    public static final String HWDMA_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Association_managedMemories";

    public static final String HWDMA_ASSOCIATION_NBCHANNELS_TAGTYPE = "HwDMA_Association_nbChannels";

    public static final String HWDMA_ASSOCIATION_TRANSFERWIDTH_TAGTYPE = "HwDMA_Association_transferWidth";

    /**
     * Tells whether a {@link HwDMAAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwDMA_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwDMA_Association >> then instantiate a {@link HwDMAAssociation} proxy.
     * 
     * @return a {@link HwDMAAssociation} proxy on the created {@link Association}.
     */
    public static HwDMAAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAAssociation.STEREOTYPE_NAME);
        return HwDMAAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAAssociation} proxy from a {@link Association} stereotyped << HwDMA_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwDMAAssociation} proxy or <i>null</i>.
     */
    public static HwDMAAssociation instantiate(final Association obj) {
        return HwDMAAssociation.canInstantiate(obj) ? new HwDMAAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDMAAssociation} proxy from a {@link Association} stereotyped << HwDMA_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwDMAAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwDMAAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwDMAAssociation.canInstantiate(obj))
        	return new HwDMAAssociation(obj);
        else
        	throw new IllegalArgumentException("HwDMAAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwDMAAssociation other = (HwDMAAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Association_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Association_drivenBy() {
        return this.elt.getTagValues(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Association_elementSize() {
        return this.elt.getTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Association_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Association_managedMemories() {
        return this.elt.getTagValues(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Association_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Association_nbChannels() {
        return this.elt.getTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Association_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Association_transferWidth() {
        return this.elt.getTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Association_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Association_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Association_elementSize(final String value) {
        this.elt.putTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Association_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Association_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Association_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Association_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Association_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Association_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    protected HwDMAAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDMA_ASSOCIATION_NBCHANNELS_TAGTYPE_ELT;

        public static TagType HWDMA_ASSOCIATION_TRANSFERWIDTH_TAGTYPE_ELT;

        public static TagType HWDMA_ASSOCIATION_DRIVENBY_TAGTYPE_ELT;

        public static TagType HWDMA_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT;

        public static TagType HWDMA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8aaab186-10b2-11df-81d9-0014222a9f79");
            HWDMA_ASSOCIATION_NBCHANNELS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8aaab189-10b2-11df-81d9-0014222a9f79");
            HWDMA_ASSOCIATION_TRANSFERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8aaab188-10b2-11df-81d9-0014222a9f79");
            HWDMA_ASSOCIATION_DRIVENBY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8aaab187-10b2-11df-81d9-0014222a9f79");
            HWDMA_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6f587c00-162f-11df-b9be-0014222a9f79");
            HWDMA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "975183bb-92a3-11e0-a69d-0027103f347c");
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
