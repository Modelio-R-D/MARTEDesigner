/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwDrive_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dd3eb526-935c-411d-bd31-5e9107454f30")
public class HwDriveAssociationEnd extends HwMemoryAssociationEnd {
    @objid ("7894433f-ab58-480e-b55e-e833881ed23e")
    public static final String STEREOTYPE_NAME = "HwDrive_AssociationEnd";

    @objid ("71c4e840-1ee3-45f2-a06a-5a47ed7f9ca9")
    public static final String HWDRIVE_ASSOCIATIONEND_BUFFER_TAGTYPE = "HwDrive_AssociationEnd_buffer";

    @objid ("ebe1c269-e3d2-4c5d-b4bf-c935c7611bf7")
    public static final String HWDRIVE_ASSOCIATIONEND_SECTORSIZE_TAGTYPE = "HwDrive_AssociationEnd_sectorSize";

    /**
     * Tells whether a {@link HwDriveAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwDrive_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5d0905e4-9349-4788-b7e4-e3a412b72077")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwDrive_AssociationEnd >> then instantiate a {@link HwDriveAssociationEnd} proxy.
     * 
     * @return a {@link HwDriveAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("40b88667-246d-4d92-9c26-a3882f883e68")
    public static HwDriveAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveAssociationEnd.STEREOTYPE_NAME);
        return HwDriveAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwDrive_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwDriveAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("40ec6f0e-f5be-42cf-9c37-1537cd5b3655")
    public static HwDriveAssociationEnd instantiate(final AssociationEnd obj) {
        return HwDriveAssociationEnd.canInstantiate(obj) ? new HwDriveAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDriveAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwDrive_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwDriveAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f6d9c942-743c-400c-8708-658f291b9d50")
    public static HwDriveAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwDriveAssociationEnd.canInstantiate(obj))
        	return new HwDriveAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwDriveAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8b23316b-b42c-49ae-87b6-77e6f260e9bd")
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
        HwDriveAssociationEnd other = (HwDriveAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("78078e35-bd7a-4e4e-a379-215f4eaae447")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_AssociationEnd_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c53bb62-75e7-4b7e-b8ab-155ee39bd04e")
    public String getHwDrive_AssociationEnd_buffer() {
        return this.elt.getTagValue(HwDriveAssociationEnd.MdaTypes.HWDRIVE_ASSOCIATIONEND_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_AssociationEnd_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27692ee1-7353-4d9a-b0eb-2a7fed85ee5c")
    public String getHwDrive_AssociationEnd_sectorSize() {
        return this.elt.getTagValue(HwDriveAssociationEnd.MdaTypes.HWDRIVE_ASSOCIATIONEND_SECTORSIZE_TAGTYPE_ELT);
    }

    @objid ("73d4826e-2c2c-4d74-9cef-c3a1c75252fa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_AssociationEnd_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("175f5497-dafa-4b4c-baeb-a09f3b406ba4")
    public void setHwDrive_AssociationEnd_buffer(final String value) {
        this.elt.putTagValue(HwDriveAssociationEnd.MdaTypes.HWDRIVE_ASSOCIATIONEND_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_AssociationEnd_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("00df6caf-6b80-4d0f-85cd-f1e1085c05fd")
    public void setHwDrive_AssociationEnd_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveAssociationEnd.MdaTypes.HWDRIVE_ASSOCIATIONEND_SECTORSIZE_TAGTYPE_ELT, value);
    }

    @objid ("f7e6b7e1-838f-4d3d-bbaf-6a00d4c477ad")
    protected HwDriveAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("0700f38e-c461-4db7-ad1e-3f5f1071eb01")
    public static final class MdaTypes {
        @objid ("a3a910d3-b752-4f3e-b3cf-4d636878018f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ab43b51a-0d23-4bca-944e-8492e0ab7c91")
        public static TagType HWDRIVE_ASSOCIATIONEND_SECTORSIZE_TAGTYPE_ELT;

        @objid ("c8d60ad2-3324-470f-9f73-1f398f25f527")
        public static TagType HWDRIVE_ASSOCIATIONEND_BUFFER_TAGTYPE_ELT;

        @objid ("96dcd5ac-54d5-478d-8f24-c66c040bb66a")
        private static Stereotype MDAASSOCDEP;

        @objid ("14543918-f6f8-4a7e-aed1-af3ae900bc8d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dd5ccec6-dae6-41ee-9cce-9b625351f2ad")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "016eb350-0ccf-11df-8525-001302895b2b");
            HWDRIVE_ASSOCIATIONEND_SECTORSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "016eb357-0ccf-11df-8525-001302895b2b");
            HWDRIVE_ASSOCIATIONEND_BUFFER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "016eb35e-0ccf-11df-8525-001302895b2b");
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
