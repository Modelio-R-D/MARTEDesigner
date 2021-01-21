/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("143f6b74-6b73-4648-9dac-0790c02403f2")
    public static final String STEREOTYPE_NAME = "HwDMA_Instance";

    @objid ("e02268d7-4e2c-46ae-95b2-9674d5181abd")
    public static final String HWDMA_INSTANCE_DRIVENBY_TAGTYPE = "HwDMA_Instance_drivenBy";

    @objid ("b1871019-9f7c-4caf-a397-36d53f45a8d2")
    public static final String HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE = "HwDMA_Instance_elementSize";

    @objid ("4cc4d485-e251-4467-ad0a-85054427127f")
    public static final String HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Instance_managedMemories";

    @objid ("70bf038f-41fb-4489-9cda-cf3c1897b84a")
    public static final String HWDMA_INSTANCE_NBCHANNELS_TAGTYPE = "HwDMA_Instance_nbChannels";

    @objid ("b33550e7-f839-4d9d-bdfb-7a3537aa3437")
    public static final String HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE = "HwDMA_Instance_transferWidth";

    /**
     * Tells whether a {@link HwDMAInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwDMA_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0425a6b5-3027-4799-93bb-7f3bb896d71c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwDMA_Instance >> then instantiate a {@link HwDMAInstance} proxy.
     * 
     * @return a {@link HwDMAInstance} proxy on the created {@link Instance}.
     */
    @objid ("3109c7ff-c4d3-4013-831f-b5521746bb77")
    public static HwDMAInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAInstance.STEREOTYPE_NAME);
        return HwDMAInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAInstance} proxy from a {@link Instance} stereotyped << HwDMA_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwDMAInstance} proxy or <i>null</i>.
     */
    @objid ("88ec3472-4ce0-45ae-8493-b94158324c9b")
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
    @objid ("08f0477a-1611-408e-97cd-93e1a7b03a3d")
    public static HwDMAInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwDMAInstance.canInstantiate(obj))
        	return new HwDMAInstance(obj);
        else
        	throw new IllegalArgumentException("HwDMAInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ae808ad9-fa27-46eb-9593-d6113519230a")
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
    @objid ("217c90c2-4ea9-431d-8918-16e1cbd8b76f")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Instance_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3df3114b-c032-425d-bf38-05e237ed7444")
    public List<String> getHwDMA_Instance_drivenBy() {
        return this.elt.getTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("648c23f8-438c-4452-a331-c2d5525a62d4")
    public String getHwDMA_Instance_elementSize() {
        return this.elt.getTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Instance_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cba84f81-5a5a-4722-82fe-bb158802408b")
    public List<String> getHwDMA_Instance_managedMemories() {
        return this.elt.getTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Instance_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60fa6173-6222-4afa-b399-4aa83cddcb6c")
    public String getHwDMA_Instance_nbChannels() {
        return this.elt.getTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Instance_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40fda69f-322d-4649-8ab0-8254904f38fc")
    public String getHwDMA_Instance_transferWidth() {
        return this.elt.getTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @objid ("dba7b6b3-3a45-4fdf-9311-78a977ee7e2a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Instance_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("357b3dd0-ac82-4b21-b84e-3593ff902683")
    public void setHwDMA_Instance_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("56f3dde8-99c7-4335-940e-fbf485476d43")
    public void setHwDMA_Instance_elementSize(final String value) {
        this.elt.putTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Instance_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("78e645fe-20c7-4341-bf02-9a69835568a3")
    public void setHwDMA_Instance_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Instance_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c17e1ef8-efab-441f-82a8-59dbc87221f6")
    public void setHwDMA_Instance_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Instance_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90ef24b8-27f4-4743-8788-394e841237b0")
    public void setHwDMA_Instance_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAInstance.MdaTypes.HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("a773ffac-b825-4aed-90fb-a4fd8bbc7804")
    protected HwDMAInstance(final Instance elt) {
        super(elt);
    }

    @objid ("a29b77b6-73e3-44d2-9d42-421b0adaba6d")
    public static final class MdaTypes {
        @objid ("7da60574-0de9-4d3b-a407-dc48e3eb0256")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("74ec7f8d-7964-477d-aa68-c1a1b57c281c")
        public static TagType HWDMA_INSTANCE_NBCHANNELS_TAGTYPE_ELT;

        @objid ("dd316b4f-e0f3-4e89-8a94-dd510ef297e4")
        public static TagType HWDMA_INSTANCE_TRANSFERWIDTH_TAGTYPE_ELT;

        @objid ("546c15f9-3543-4591-a61a-744fbd37a167")
        public static TagType HWDMA_INSTANCE_DRIVENBY_TAGTYPE_ELT;

        @objid ("6d8a9f06-6ab3-4b51-a2ea-36730888dd97")
        public static TagType HWDMA_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("4b622ec0-1b70-40b8-a02f-6ecc0c1b9f2a")
        public static TagType HWDMA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("11bb5294-0f72-456f-982d-2cf7307a5486")
        private static Stereotype MDAASSOCDEP;

        @objid ("cadd7b68-9c3d-49ec-8efd-2a2380855d3d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b9910aa7-7500-4c58-87d6-c8547f672187")
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
