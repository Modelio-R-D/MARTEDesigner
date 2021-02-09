/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwArbiterInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwDMA_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwDMAInstance extends HwArbiterInstance {
    public static final String STEREOTYPE_NAME = "HwDMA_Instance";

    public static final String HWDMA_INSTANCE_DRIVENBY_TAGTYPE = "HwDMA_Instance_drivenBy";

    public static final String HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE = "HwDMA_Instance_elementSize";

    public static final String HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Instance_managedMemories";

    public static final String HWDMA_INSTANCE_NBCHANNELS_TAGTYPE = "HwDMA_Instance_nbChannels";

    public static final String HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE = "HwDMA_Instance_transferWidth";

    /**
     * Tells whether a {@link HwDMAInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwDMA_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwDMA_Instance >> then instantiate a {@link HwDMAInstance} proxy.
     * 
     * @return a {@link HwDMAInstance} proxy on the created {@link Instance}.
     */
    public static HwDMAInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAInstance.STEREOTYPE_NAME);
        return HwDMAInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAInstance} proxy from a {@link Instance} stereotyped << HwDMA_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwDMAInstance} proxy or <i>null</i>.
     */
    public static HwDMAInstance instantiate(final Instance obj) {
        return HwDMAInstance.canInstantiate(obj) ? new HwDMAInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDMAInstance} proxy from a {@link Instance} stereotyped << HwDMA_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwDMAInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwDMAInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwDMAInstance.canInstantiate(obj))
        	return new HwDMAInstance(obj);
        else
        	throw new IllegalArgumentException("HwDMAInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwDMAInstance other = (HwDMAInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Instance_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Instance_drivenBy() {
        return this.elt.getTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Instance_elementSize() {
        return this.elt.getTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Instance_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Instance_managedMemories() {
        return this.elt.getTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Instance_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Instance_nbChannels() {
        return this.elt.getTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Instance_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Instance_transferWidth() {
        return this.elt.getTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Instance_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Instance_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Instance_elementSize(final String value) {
        this.elt.putTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Instance_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Instance_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Instance_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Instance_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Instance_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Instance_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    protected HwDMAInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDMA_INSTANCE_NBCHANNELS_TAGTYPE_ELT;

        public static TagType HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE_ELT;

        public static TagType HWDMA_INSTANCE_DRIVENBY_TAGTYPE_ELT;

        public static TagType HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT;

        public static TagType HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01783c9d-0ccf-11df-8525-001302895b2b");
            HWDMA_INSTANCE_NBCHANNELS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d0142-0ccf-11df-8525-001302895b2b");
            HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d0149-0ccf-11df-8525-001302895b2b");
            HWDMA_INSTANCE_DRIVENBY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d0150-0ccf-11df-8525-001302895b2b");
            HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6e4d7580-162f-11df-b9be-0014222a9f79");
            HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9fab5504-92a3-11e0-a69d-0027103f347c");
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
