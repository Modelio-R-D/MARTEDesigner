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
@objid ("04db1cd6-02d8-4e46-abae-1c91e7caf9fa")
public class HwDMAInstance extends HwArbiterInstance {
    @objid ("c56dede6-7927-4cfa-875c-82141209946b")
    public static final String STEREOTYPE_NAME = "HwDMA_Instance";

    @objid ("eb268a6b-86b7-4eed-862b-57da7539a05e")
    public static final String HWDMA_INSTANCE_DRIVENBY_TAGTYPE = "HwDMA_Instance_drivenBy";

    @objid ("9fc4988b-6007-4c77-8d1c-d270f9d47f0d")
    public static final String HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE = "HwDMA_Instance_elementSize";

    @objid ("491eaef1-6212-4bc7-acdc-45f4810bcf26")
    public static final String HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Instance_managedMemories";

    @objid ("50dede75-b19b-4b8b-98d9-ed988e02a394")
    public static final String HWDMA_INSTANCE_NBCHANNELS_TAGTYPE = "HwDMA_Instance_nbChannels";

    @objid ("4898874e-b23a-45b1-a30d-aa81c41b1447")
    public static final String HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE = "HwDMA_Instance_transferWidth";

    /**
     * Tells whether a {@link HwDMAInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwDMA_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("845a5559-990a-4fb4-9a28-7037102cd2d3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwDMA_Instance >> then instantiate a {@link HwDMAInstance} proxy.
     * 
     * @return a {@link HwDMAInstance} proxy on the created {@link Instance}.
     */
    @objid ("bd1b6b7e-7fea-40b8-a395-09032e02cf76")
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
    @objid ("83e937d7-6f9f-4311-9000-7e757a9fed5e")
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
    @objid ("47cd1ed1-b661-459d-b4e6-ae2c2e175eb1")
    public static HwDMAInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwDMAInstance.canInstantiate(obj))
        	return new HwDMAInstance(obj);
        else
        	throw new IllegalArgumentException("HwDMAInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("51c14ce1-c90e-4bdf-901d-5fbf3c5df08f")
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
    @objid ("2f2c8937-ab91-4c2d-a113-0ff8269c6a67")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Instance_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("32a72cfb-e476-4b6c-a89d-374c2d931d68")
    public List<String> getHwDMA_Instance_drivenBy() {
        return this.elt.getTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02b7e7c6-3b48-4229-a699-b1d23e36b0eb")
    public String getHwDMA_Instance_elementSize() {
        return this.elt.getTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Instance_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f1637e7f-6e00-4fe6-828c-7d14bffbc9f4")
    public List<String> getHwDMA_Instance_managedMemories() {
        return this.elt.getTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Instance_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ecf3e9aa-bb5b-4561-a75e-542097d58902")
    public String getHwDMA_Instance_nbChannels() {
        return this.elt.getTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Instance_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04773190-43b9-4b9b-b83a-07a2d2c232c8")
    public String getHwDMA_Instance_transferWidth() {
        return this.elt.getTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @objid ("2736a393-493a-4a81-b6bf-0006f8f751a6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Instance_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7be82ff7-be45-4b20-94ae-c492650ae2d0")
    public void setHwDMA_Instance_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9fcd04ca-b8c3-42aa-bd9c-50a96d102ed4")
    public void setHwDMA_Instance_elementSize(final String value) {
        this.elt.putTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Instance_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0452f906-eec7-4fcd-a7ab-69685087b484")
    public void setHwDMA_Instance_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Instance_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22cf7cf3-e7dc-4802-bed2-c2419859ea87")
    public void setHwDMA_Instance_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Instance_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8e83a22-8c21-4bd4-a057-511fb4005ad4")
    public void setHwDMA_Instance_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("f6a20a26-be06-475e-b24c-65777dc24acd")
    protected HwDMAInstance(final Instance elt) {
        super(elt);
    }

    @objid ("a29b77b6-73e3-44d2-9d42-421b0adaba6d")
    public static final class MdaTypes {
        @objid ("b02e5f86-e7bb-4494-ab73-5ac919e59d84")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e9b922e8-219a-420f-9ded-02067ab7c039")
        public static TagType HWDMA_INSTANCE_NBCHANNELS_TAGTYPE_ELT;

        @objid ("20c343c9-9679-48c1-bc9b-86f9b7b1c3b9")
        public static TagType HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE_ELT;

        @objid ("f6db875e-80a1-4c9d-afb8-10b2e422fd30")
        public static TagType HWDMA_INSTANCE_DRIVENBY_TAGTYPE_ELT;

        @objid ("7a82eaf4-f6d6-46b4-871e-a2dd9c71da88")
        public static TagType HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("20a02e8f-30aa-459c-bc5b-8d190bfda9a5")
        public static TagType HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("ce6522ee-8a76-4731-8a9f-9797e8ebd94d")
        private static Stereotype MDAASSOCDEP;

        @objid ("607d020b-2bdd-479e-9e70-429be2f1443f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5527acdc-21a9-4ea3-a250-37fb2f214210")
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
