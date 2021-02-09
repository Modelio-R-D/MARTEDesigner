/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwDrive_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwDriveAssociation extends HwMemoryAssociation {
    public static final String STEREOTYPE_NAME = "HwDrive_Association";

    public static final String HWDRIVE_ASSOCIATION_BUFFER_TAGTYPE = "HwDrive_Association_buffer";

    public static final String HWDRIVE_ASSOCIATION_SECTORSIZE_TAGTYPE = "HwDrive_Association_sectorSize";

    /**
     * Tells whether a {@link HwDriveAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwDrive_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwDrive_Association >> then instantiate a {@link HwDriveAssociation} proxy.
     * 
     * @return a {@link HwDriveAssociation} proxy on the created {@link Association}.
     */
    public static HwDriveAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveAssociation.STEREOTYPE_NAME);
        return HwDriveAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveAssociation} proxy from a {@link Association} stereotyped << HwDrive_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwDriveAssociation} proxy or <i>null</i>.
     */
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
    public static HwDriveAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwDriveAssociation.canInstantiate(obj))
        	return new HwDriveAssociation(obj);
        else
        	throw new IllegalArgumentException("HwDriveAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwDriveAssociation other = (HwDriveAssociation) obj;
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
     * Getter for string property 'HwDrive_Association_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDrive_Association_buffer() {
        return this.elt.getTagValue(HwDriveAssociation.MdaTypes.HWDRIVE_ASSOCIATION_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Association_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDrive_Association_sectorSize() {
        return this.elt.getTagValue(HwDriveAssociation.MdaTypes.HWDRIVE_ASSOCIATION_SECTORSIZE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Association_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDrive_Association_buffer(final String value) {
        this.elt.putTagValue(HwDriveAssociation.MdaTypes.HWDRIVE_ASSOCIATION_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Association_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDrive_Association_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveAssociation.MdaTypes.HWDRIVE_ASSOCIATION_SECTORSIZE_TAGTYPE_ELT, value);
    }

    protected HwDriveAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDRIVE_ASSOCIATION_SECTORSIZE_TAGTYPE_ELT;

        public static TagType HWDRIVE_ASSOCIATION_BUFFER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
