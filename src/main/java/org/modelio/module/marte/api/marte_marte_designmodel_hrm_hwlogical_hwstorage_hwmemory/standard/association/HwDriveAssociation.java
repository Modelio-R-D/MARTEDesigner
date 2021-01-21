/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwDrive_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("39df7876-73c6-4ac5-9a2a-ef059dfbcbe8")
public class HwDriveAssociation extends HwMemoryAssociation {
    @objid ("c8368cc8-a88b-46bb-8889-74c8b203292f")
    public static final String STEREOTYPE_NAME = "HwDrive_Association";

    @objid ("b0c5b094-83a5-43df-8b5f-2ccb28a74dc9")
    public static final String HWDRIVE_ASSOCIATION_BUFFER_TAGTYPE = "HwDrive_Association_buffer";

    @objid ("3b564b85-1fb8-4aba-9420-e0c5a78f7dea")
    public static final String HWDRIVE_ASSOCIATION_SECTORSIZE_TAGTYPE = "HwDrive_Association_sectorSize";

    /**
     * Tells whether a {@link HwDriveAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwDrive_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("29596d66-055b-45a8-9190-e436b851e744")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwDrive_Association >> then instantiate a {@link HwDriveAssociation} proxy.
     * 
     * @return a {@link HwDriveAssociation} proxy on the created {@link Association}.
     */
    @objid ("8fd3eb62-2e08-4360-83e5-c1399710ee2c")
    public static HwDriveAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveAssociation.STEREOTYPE_NAME);
        return HwDriveAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveAssociation} proxy from a {@link Association} stereotyped << HwDrive_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwDriveAssociation} proxy or <i>null</i>.
     */
    @objid ("b8a562f0-722c-4f4e-bc7d-ebebd59819ec")
    public static HwDriveAssociation instantiate(final Association obj) {
        return HwDriveAssociation.canInstantiate(obj) ? new HwDriveAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDriveAssociation} proxy from a {@link Association} stereotyped << HwDrive_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwDriveAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f98fc2fb-0a81-4d45-aa83-071217a6e9df")
    public static HwDriveAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwDriveAssociation.canInstantiate(obj))
        	return new HwDriveAssociation(obj);
        else
        	throw new IllegalArgumentException("HwDriveAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f7c72db5-a5da-449d-9678-46e8ef58b4b4")
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
        HwDriveAssociation other = (HwDriveAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("a8eeb377-c5d0-49e5-8c19-ea2090c30948")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Association_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4eb4678f-b2e7-4aa1-a4f6-572b3f5eb571")
    public String getHwDrive_Association_buffer() {
        return this.elt.getTagValue(HwDriveAssociation.MdaTypes.HWDRIVE_ASSOCIATION_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Association_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("55862eb6-ea0b-44c5-b709-fa427af4da51")
    public String getHwDrive_Association_sectorSize() {
        return this.elt.getTagValue(HwDriveAssociation.MdaTypes.HWDRIVE_ASSOCIATION_SECTORSIZE_TAGTYPE_ELT);
    }

    @objid ("0d244e2b-972e-4244-825d-29ab6c20a3b7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Association_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("12b0c7e7-30c1-42d6-8499-0334d557d6b5")
    public void setHwDrive_Association_buffer(final String value) {
        this.elt.putTagValue(HwDriveAssociation.MdaTypes.HWDRIVE_ASSOCIATION_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Association_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b885a8a-8942-4f3c-9b99-e0f07055b658")
    public void setHwDrive_Association_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveAssociation.MdaTypes.HWDRIVE_ASSOCIATION_SECTORSIZE_TAGTYPE_ELT, value);
    }

    @objid ("f80a665c-c4e3-472d-a51f-25cdfd05fb4c")
    protected HwDriveAssociation(final Association elt) {
        super(elt);
    }

    @objid ("1d44f142-6078-4627-bd92-892ae3be7c2c")
    public static final class MdaTypes {
        @objid ("add803f6-663b-4a11-a071-be33dd80d1b5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("33d0cc9d-199c-48e4-b11f-dd016044eb0c")
        public static TagType HWDRIVE_ASSOCIATION_SECTORSIZE_TAGTYPE_ELT;

        @objid ("992faa01-8bca-4ea8-ac26-1ceefcf40b85")
        public static TagType HWDRIVE_ASSOCIATION_BUFFER_TAGTYPE_ELT;

        @objid ("33be281a-a8a8-4085-abd9-7bd86289bb34")
        private static Stereotype MDAASSOCDEP;

        @objid ("3fada66e-c168-4b5e-801c-e64dfb23f5c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("00184b51-c45e-4ac2-813b-d1bf84c9388b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f2562656-1009-11df-86fe-0014222a9f79");
            HWDRIVE_ASSOCIATION_SECTORSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "15a2632c-100a-11df-86fe-0014222a9f79");
            HWDRIVE_ASSOCIATION_BUFFER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "15a2632d-100a-11df-86fe-0014222a9f79");
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
