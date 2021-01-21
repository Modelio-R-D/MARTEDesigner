/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwArbiterAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwDMA_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4a035317-8ee0-4a82-b1fb-4a6c5ecb2673")
public class HwDMAAssociationEnd extends HwArbiterAssociationEnd {
    @objid ("c226db66-4417-4914-9707-e981f7a387e7")
    public static final String STEREOTYPE_NAME = "HwDMA_AssociationEnd";

    @objid ("9eb804e1-97ca-49c4-8260-b77b8fc986b4")
    public static final String HWDMA_ASSOCIATIONEND_DRIVENBY_TAGTYPE = "HwDMA_AssociationEnd_drivenBy";

    @objid ("4eea884d-7df8-4969-adaa-8dc095ea33a0")
    public static final String HWDMA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE = "HwDMA_AssociationEnd_elementSize";

    @objid ("cd1f4862-0250-40a3-b5e0-d917795691ce")
    public static final String HWDMA_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE = "HwDMA_AssociationEnd_managedMemories";

    @objid ("a00a3642-e0e6-4408-b7a5-e1759fce1259")
    public static final String HWDMA_ASSOCIATIONEND_NBCHANNELS_TAGTYPE = "HwDMA_AssociationEnd_nbChannels";

    @objid ("2748ad8e-b586-46b8-b13b-ed6bffe80b78")
    public static final String HWDMA_ASSOCIATIONEND_TRANSFERWIDTH_TAGTYPE = "HwDMA_AssociationEnd_transferWidth";

    /**
     * Tells whether a {@link HwDMAAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwDMA_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b321f90d-0fe1-45db-a71d-a7ed8f8e7379")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwDMA_AssociationEnd >> then instantiate a {@link HwDMAAssociationEnd} proxy.
     * 
     * @return a {@link HwDMAAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("f91794b9-67aa-4d7a-9dae-69ef4f8ecaca")
    public static HwDMAAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAAssociationEnd.STEREOTYPE_NAME);
        return HwDMAAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwDMA_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwDMAAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("21413e18-963b-4fca-b912-cdcc8f73423b")
    public static HwDMAAssociationEnd instantiate(final AssociationEnd obj) {
        return HwDMAAssociationEnd.canInstantiate(obj) ? new HwDMAAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDMAAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwDMA_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwDMAAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3ab9c35a-26a3-4aed-b946-6f21819a1f0e")
    public static HwDMAAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwDMAAssociationEnd.canInstantiate(obj))
        	return new HwDMAAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwDMAAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("30d8e482-ca27-44f1-88ed-51c642efdbe1")
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
        HwDMAAssociationEnd other = (HwDMAAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("0dd17924-7e01-4464-8682-038d48052e9b")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_AssociationEnd_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c21ca546-8603-45db-8c1e-53a5edb4e154")
    public List<String> getHwDMA_AssociationEnd_drivenBy() {
        return this.elt.getTagValues(HwDMAAssociationEnd.MdaTypes.HWDMA_ASSOCIATIONEND_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6cdec9a0-d499-418e-8e41-f9f9c12749dc")
    public String getHwDMA_AssociationEnd_elementSize() {
        return this.elt.getTagValue(HwDMAAssociationEnd.MdaTypes.HWDMA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_AssociationEnd_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6ec9904f-6fcb-4d0b-ac33-444dbcab4704")
    public List<String> getHwDMA_AssociationEnd_managedMemories() {
        return this.elt.getTagValues(HwDMAAssociationEnd.MdaTypes.HWDMA_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_AssociationEnd_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0aed8727-ba7b-40b0-930f-8bcf2275731a")
    public String getHwDMA_AssociationEnd_nbChannels() {
        return this.elt.getTagValue(HwDMAAssociationEnd.MdaTypes.HWDMA_ASSOCIATIONEND_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_AssociationEnd_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7eb9275-6ffa-494f-a308-4956cee973fe")
    public String getHwDMA_AssociationEnd_transferWidth() {
        return this.elt.getTagValue(HwDMAAssociationEnd.MdaTypes.HWDMA_ASSOCIATIONEND_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @objid ("47c2c326-4e86-45b7-a7bf-48a412dc82dd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_AssociationEnd_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cf2ad170-ddfe-4967-a342-b2d85a3d1be5")
    public void setHwDMA_AssociationEnd_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAAssociationEnd.MdaTypes.HWDMA_ASSOCIATIONEND_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4cdc62a8-519d-4194-8b90-e1fe29a856c6")
    public void setHwDMA_AssociationEnd_elementSize(final String value) {
        this.elt.putTagValue(HwDMAAssociationEnd.MdaTypes.HWDMA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_AssociationEnd_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41974290-34f4-4b33-9ae2-f495a8b2d956")
    public void setHwDMA_AssociationEnd_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAAssociationEnd.MdaTypes.HWDMA_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_AssociationEnd_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c5b6671-ed61-44d6-8e2e-ab313083e0d7")
    public void setHwDMA_AssociationEnd_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAAssociationEnd.MdaTypes.HWDMA_ASSOCIATIONEND_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_AssociationEnd_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1b49bf4-49ba-42cb-85ce-421029a8aab9")
    public void setHwDMA_AssociationEnd_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAAssociationEnd.MdaTypes.HWDMA_ASSOCIATIONEND_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("6bda1b8e-3c70-41f6-b2cf-ad73f6d1347c")
    protected HwDMAAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("206b4776-aa2f-415a-aad0-0d3c338cbe99")
    public static final class MdaTypes {
        @objid ("466d2f04-2a9a-4e61-9eed-4d83acb213cf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("943a69f7-1ad8-4d29-812a-b9f5b1237d28")
        public static TagType HWDMA_ASSOCIATIONEND_NBCHANNELS_TAGTYPE_ELT;

        @objid ("62f488b5-1b98-471a-a793-d4b584e799a8")
        public static TagType HWDMA_ASSOCIATIONEND_TRANSFERWIDTH_TAGTYPE_ELT;

        @objid ("f017bf9f-7ef1-4757-bc35-21160fa9afc9")
        public static TagType HWDMA_ASSOCIATIONEND_DRIVENBY_TAGTYPE_ELT;

        @objid ("7de0d822-8804-4efc-8f5a-96fb170a9397")
        public static TagType HWDMA_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("df477f99-b7c7-4427-8c12-0e2898a87530")
        public static TagType HWDMA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("a689b50e-dd66-4b75-8781-466a87612141")
        private static Stereotype MDAASSOCDEP;

        @objid ("99427ffd-50ae-476e-b6e6-21eb1f2411c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e042fdf2-e96b-440a-a6d3-2e5da919c14e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01783c98-0ccf-11df-8525-001302895b2b");
            HWDMA_ASSOCIATIONEND_NBCHANNELS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d013d-0ccf-11df-8525-001302895b2b");
            HWDMA_ASSOCIATIONEND_TRANSFERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d0144-0ccf-11df-8525-001302895b2b");
            HWDMA_ASSOCIATIONEND_DRIVENBY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d014b-0ccf-11df-8525-001302895b2b");
            HWDMA_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "73ad1dd8-162f-11df-b9be-0014222a9f79");
            HWDMA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c483db2-92a3-11e0-a69d-0027103f347c");
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
