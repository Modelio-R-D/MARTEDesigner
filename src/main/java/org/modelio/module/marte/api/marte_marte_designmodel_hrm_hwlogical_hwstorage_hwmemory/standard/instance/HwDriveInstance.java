/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwDrive_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8d716408-9958-4ccf-8295-19269748d7e0")
public class HwDriveInstance extends HwMemoryInstance {
    @objid ("9715a63f-9aff-422b-81cc-c1090d73faf2")
    public static final String STEREOTYPE_NAME = "HwDrive_Instance";

    @objid ("6bb52a3a-9113-4ad6-b82f-4e3a6b9f1ec2")
    public static final String HWDRIVE_INSTANCE_BUFFER_TAGTYPE = "HwDrive_Instance_buffer";

    @objid ("0db92796-4256-4c76-a86d-5f82b15a3e4b")
    public static final String HWDRIVE_INSTANCE_SECTORSIZE_TAGTYPE = "HwDrive_Instance_sectorSize";

    /**
     * Tells whether a {@link HwDriveInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwDrive_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ef3bc12d-416b-4ac5-aeac-549ca52a7072")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwDrive_Instance >> then instantiate a {@link HwDriveInstance} proxy.
     * 
     * @return a {@link HwDriveInstance} proxy on the created {@link Instance}.
     */
    @objid ("c2fd4bf7-6eb7-4cfc-a339-94b969a78cec")
    public static HwDriveInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveInstance.STEREOTYPE_NAME);
        return HwDriveInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveInstance} proxy from a {@link Instance} stereotyped << HwDrive_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwDriveInstance} proxy or <i>null</i>.
     */
    @objid ("ef4d444f-fae0-4564-bf98-b4b2e2f6fc08")
    public static HwDriveInstance instantiate(final Instance obj) {
        return HwDriveInstance.canInstantiate(obj) ? new HwDriveInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDriveInstance} proxy from a {@link Instance} stereotyped << HwDrive_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwDriveInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e5038d95-ffd6-4c81-99ef-ca8fd11543e7")
    public static HwDriveInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwDriveInstance.canInstantiate(obj))
        	return new HwDriveInstance(obj);
        else
        	throw new IllegalArgumentException("HwDriveInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("38b5f4f1-005c-4a7d-942e-29876f997d27")
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
        HwDriveInstance other = (HwDriveInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("dc449f98-62c9-4a8c-a018-e0a8ef5e0956")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Instance_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3f38e80-3deb-4f52-b376-dd60d570b767")
    public String getHwDrive_Instance_buffer() {
        return this.elt.getTagValue(HwDriveInstance.MdaTypes.HWDRIVE_INSTANCE_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Instance_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8f2c332-b6ba-4ed0-a62e-5ab6dafb7d6c")
    public String getHwDrive_Instance_sectorSize() {
        return this.elt.getTagValue(HwDriveInstance.MdaTypes.HWDRIVE_INSTANCE_SECTORSIZE_TAGTYPE_ELT);
    }

    @objid ("9f549ada-fdff-4cf4-a7d3-c4bd13cdad44")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Instance_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76adbffb-5185-417a-a7bc-7a380cd55907")
    public void setHwDrive_Instance_buffer(final String value) {
        this.elt.putTagValue(HwDriveInstance.MdaTypes.HWDRIVE_INSTANCE_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Instance_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c721855b-ab3e-45bc-98ab-49bdd1645429")
    public void setHwDrive_Instance_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveInstance.MdaTypes.HWDRIVE_INSTANCE_SECTORSIZE_TAGTYPE_ELT, value);
    }

    @objid ("9fe2d24e-9eca-4497-9ca4-37c1c986b99d")
    protected HwDriveInstance(final Instance elt) {
        super(elt);
    }

    @objid ("76e6a70b-375a-4a32-9e71-0621fe1cd766")
    public static final class MdaTypes {
        @objid ("83e73356-a998-4c5f-b2bd-289cfadd69de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a4702b6b-1496-4aef-bd62-feeb1742f60a")
        public static TagType HWDRIVE_INSTANCE_SECTORSIZE_TAGTYPE_ELT;

        @objid ("68d866de-d6cb-4e22-b552-8279d4e62bad")
        public static TagType HWDRIVE_INSTANCE_BUFFER_TAGTYPE_ELT;

        @objid ("960c62b4-87ec-48c5-8d5a-ac346c4c414f")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c3350db-8f19-4316-81a7-576588b12162")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d98b5468-0894-472f-9a1f-17b01953ba45")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "016eb355-0ccf-11df-8525-001302895b2b");
            HWDRIVE_INSTANCE_SECTORSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "016eb35c-0ccf-11df-8525-001302895b2b");
            HWDRIVE_INSTANCE_BUFFER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "016eb363-0ccf-11df-8525-001302895b2b");
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
