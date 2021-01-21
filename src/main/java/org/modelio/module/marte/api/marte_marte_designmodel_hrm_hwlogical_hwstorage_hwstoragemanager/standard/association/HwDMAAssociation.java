/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.association;

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
@objid ("6335eb42-c840-45ab-9db5-61802896196f")
public class HwDMAAssociation extends HwArbiterAssociation {
    @objid ("bc7b3436-bb27-4fbf-a567-30c79f521fc6")
    public static final String STEREOTYPE_NAME = "HwDMA_Association";

    @objid ("3008bc9d-72f8-4da1-9b6e-ac3d74bf67ad")
    public static final String HWDMA_ASSOCIATION_DRIVENBY_TAGTYPE = "HwDMA_Association_drivenBy";

    @objid ("9a2f589b-6e42-4320-97dc-6f7da6a5bbdd")
    public static final String HWDMA_ASSOCIATION_ELEMENTSIZE_TAGTYPE = "HwDMA_Association_elementSize";

    @objid ("a017eb8f-8dd4-427e-b4c0-455a00959315")
    public static final String HWDMA_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Association_managedMemories";

    @objid ("b524d57d-1b34-4695-bb48-d885017dc157")
    public static final String HWDMA_ASSOCIATION_NBCHANNELS_TAGTYPE = "HwDMA_Association_nbChannels";

    @objid ("6a2aa517-ddae-4e21-a14a-45e6c9dc14ac")
    public static final String HWDMA_ASSOCIATION_TRANSFERWIDTH_TAGTYPE = "HwDMA_Association_transferWidth";

    /**
     * Tells whether a {@link HwDMAAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwDMA_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("00f44e17-aeea-4aa4-8f86-803de59b7c64")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwDMA_Association >> then instantiate a {@link HwDMAAssociation} proxy.
     * 
     * @return a {@link HwDMAAssociation} proxy on the created {@link Association}.
     */
    @objid ("7f825f50-0917-496f-80d2-7f9443f585e4")
    public static HwDMAAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAAssociation.STEREOTYPE_NAME);
        return HwDMAAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAAssociation} proxy from a {@link Association} stereotyped << HwDMA_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwDMAAssociation} proxy or <i>null</i>.
     */
    @objid ("8248c41e-eed4-442e-aea9-44a13441f1be")
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
    @objid ("643f9bf2-0cc8-45d2-9843-d5df90ce2dd7")
    public static HwDMAAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwDMAAssociation.canInstantiate(obj))
        	return new HwDMAAssociation(obj);
        else
        	throw new IllegalArgumentException("HwDMAAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ac7d424-cdf5-447b-9ca6-daf87d703d4b")
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
    @objid ("d31478e2-99ce-4d2e-b29c-b15268447665")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Association_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("600e821e-4563-441c-8636-a249ee5ff11d")
    public List<String> getHwDMA_Association_drivenBy() {
        return this.elt.getTagValues(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("48337f66-4df1-46d9-86a5-6ba0d456ea6e")
    public String getHwDMA_Association_elementSize() {
        return this.elt.getTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Association_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ee7e55e5-0aa6-4f2f-b950-97b94bc292e5")
    public List<String> getHwDMA_Association_managedMemories() {
        return this.elt.getTagValues(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Association_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c528dae-93f4-4ccd-bb3e-3749b497c723")
    public String getHwDMA_Association_nbChannels() {
        return this.elt.getTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Association_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14898e1b-14d9-4342-a287-0630068fbb77")
    public String getHwDMA_Association_transferWidth() {
        return this.elt.getTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @objid ("6a54f4f5-4559-4c6d-9bcf-64febe5eca8f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Association_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8efe3019-cb62-48d2-b2de-95efa4cbfab5")
    public void setHwDMA_Association_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da6e79c6-c317-4a52-ae5f-d4613ec80bd0")
    public void setHwDMA_Association_elementSize(final String value) {
        this.elt.putTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Association_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e033e273-91bb-4811-a536-a074629d6149")
    public void setHwDMA_Association_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Association_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e9523d7-fe36-4a7d-90bb-99440f847524")
    public void setHwDMA_Association_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Association_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0179eac0-836b-4625-9533-a4d4e49e0210")
    public void setHwDMA_Association_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAAssociation.MdaTypes.HWDMA_ASSOCIATION_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("af5eeaae-c6b8-453b-8513-dc6df58d5771")
    protected HwDMAAssociation(final Association elt) {
        super(elt);
    }

    @objid ("ddf27ce1-be40-4e21-b9b7-34a566b94681")
    public static final class MdaTypes {
        @objid ("10022f7d-d9b0-4c03-a0d1-7e9052b6bdc3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e5eda4c8-a44f-43c6-bd41-2b1e2115a720")
        public static TagType HWDMA_ASSOCIATION_NBCHANNELS_TAGTYPE_ELT;

        @objid ("60362a93-c22e-466f-8592-6cbf77837bfb")
        public static TagType HWDMA_ASSOCIATION_TRANSFERWIDTH_TAGTYPE_ELT;

        @objid ("14bc757e-e028-471e-b3e0-5b510b0dcd24")
        public static TagType HWDMA_ASSOCIATION_DRIVENBY_TAGTYPE_ELT;

        @objid ("e9069870-f795-4301-9e7f-43dccef00193")
        public static TagType HWDMA_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("c266d65e-dd70-4efe-82d8-4907556e445d")
        public static TagType HWDMA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("a17b8584-e0c8-4ae5-bb6f-c48fbfc133c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("8724dbaf-ce24-4ee3-bffc-ff8f63f21a1c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("43aaebb0-1ed9-4d06-8800-28bd25ac0727")
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
