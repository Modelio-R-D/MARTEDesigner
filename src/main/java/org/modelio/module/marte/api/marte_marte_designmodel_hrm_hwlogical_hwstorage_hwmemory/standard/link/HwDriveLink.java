/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwDrive_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dcb24012-352a-459f-8385-19cdd644f2a2")
public class HwDriveLink extends HwMemoryLink {
    @objid ("45980d2b-1be0-4661-9f68-68f3657b56ee")
    public static final String STEREOTYPE_NAME = "HwDrive_Link";

    @objid ("b5278bb4-afb3-46cf-a8a2-7cfb04e3c951")
    public static final String HWDRIVE_LINK_BUFFER_TAGTYPE = "HwDrive_Link_buffer";

    @objid ("df1fcff6-b4c3-470a-969a-ddfa649533cc")
    public static final String HWDRIVE_LINK_SECTORSIZE_TAGTYPE = "HwDrive_Link_sectorSize";

    /**
     * Tells whether a {@link HwDriveLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwDrive_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2e965d59-fd63-48d0-8455-eaa7b6c01c17")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwDrive_Link >> then instantiate a {@link HwDriveLink} proxy.
     * 
     * @return a {@link HwDriveLink} proxy on the created {@link Link}.
     */
    @objid ("22ca4ef5-caf3-4279-9e80-31c789ed5f3a")
    public static HwDriveLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveLink.STEREOTYPE_NAME);
        return HwDriveLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveLink} proxy from a {@link Link} stereotyped << HwDrive_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwDriveLink} proxy or <i>null</i>.
     */
    @objid ("46dddf98-b196-4200-948e-61d1949f2b75")
    public static HwDriveLink instantiate(final Link obj) {
        return HwDriveLink.canInstantiate(obj) ? new HwDriveLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDriveLink} proxy from a {@link Link} stereotyped << HwDrive_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwDriveLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8f2db530-ef43-449a-92cb-d1f98549a5d2")
    public static HwDriveLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwDriveLink.canInstantiate(obj))
        	return new HwDriveLink(obj);
        else
        	throw new IllegalArgumentException("HwDriveLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f7e85ff0-6250-40c0-9dc6-dd09281f8e5d")
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
        HwDriveLink other = (HwDriveLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("4d987304-1698-4b97-9972-92e1fc553198")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Link_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81ed0842-4641-4b1c-afb1-a7981c47c886")
    public String getHwDrive_Link_buffer() {
        return this.elt.getTagValue(HwDriveLink.MdaTypes.HWDRIVE_LINK_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Link_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1cb9f8fd-c66c-4038-8e61-dedebb7dd1ec")
    public String getHwDrive_Link_sectorSize() {
        return this.elt.getTagValue(HwDriveLink.MdaTypes.HWDRIVE_LINK_SECTORSIZE_TAGTYPE_ELT);
    }

    @objid ("084d377f-afbf-4459-b2dc-3d06c05117f8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Link_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b189def-c645-451a-95f6-8907c3dc31e1")
    public void setHwDrive_Link_buffer(final String value) {
        this.elt.putTagValue(HwDriveLink.MdaTypes.HWDRIVE_LINK_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Link_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52b5ef03-a46b-4259-b006-9b88fe744f45")
    public void setHwDrive_Link_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveLink.MdaTypes.HWDRIVE_LINK_SECTORSIZE_TAGTYPE_ELT, value);
    }

    @objid ("fc293807-f258-4273-9982-ab94a10c22a2")
    protected HwDriveLink(final Link elt) {
        super(elt);
    }

    @objid ("61a4367e-3a36-4ddb-b7f0-43ce98afb852")
    public static final class MdaTypes {
        @objid ("19f2acbb-0456-4433-95c4-744696149b14")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("60f410e9-a91e-4efa-badb-cb5c722d511d")
        public static TagType HWDRIVE_LINK_SECTORSIZE_TAGTYPE_ELT;

        @objid ("cfe823c7-b3a5-45e7-9e25-34bc343f7998")
        public static TagType HWDRIVE_LINK_BUFFER_TAGTYPE_ELT;

        @objid ("f1a7f5ad-e8c5-4a67-8a9a-9c105f5cfa1c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d356763f-6204-4d8b-8f5b-5907d4b64ae0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8883f1a0-1312-4a85-a112-353d2a6f402a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "016eb354-0ccf-11df-8525-001302895b2b");
            HWDRIVE_LINK_SECTORSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "016eb35b-0ccf-11df-8525-001302895b2b");
            HWDRIVE_LINK_BUFFER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "016eb362-0ccf-11df-8525-001302895b2b");
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
