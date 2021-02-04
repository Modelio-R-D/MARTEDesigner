/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("eb613ef5-5a39-429b-85e5-cd8624999354")
    public static final String STEREOTYPE_NAME = "HwDrive_Instance";

    @objid ("7c09c2b7-db9d-4ebf-b08d-5643361ea168")
    public static final String HWDRIVE_INSTANCE_BUFFER_TAGTYPE = "HwDrive_Instance_buffer";

    @objid ("686573dd-c084-42cc-8fd6-8ac4941ba8a8")
    public static final String HWDRIVE_INSTANCE_SECTORSIZE_TAGTYPE = "HwDrive_Instance_sectorSize";

    /**
     * Tells whether a {@link HwDriveInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwDrive_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f2d8c956-a92b-414d-b017-834153dac2f2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwDrive_Instance >> then instantiate a {@link HwDriveInstance} proxy.
     * 
     * @return a {@link HwDriveInstance} proxy on the created {@link Instance}.
     */
    @objid ("1f64b3cf-52d0-45ba-9b84-5e215b1e0b57")
    public static HwDriveInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveInstance.STEREOTYPE_NAME);
        return HwDriveInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveInstance} proxy from a {@link Instance} stereotyped << HwDrive_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwDriveInstance} proxy or <i>null</i>.
     */
    @objid ("7af7985c-177e-4bc4-aae7-96acd5221fff")
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
    @objid ("7a68cdd8-c03a-4276-9aca-a7b97b572bbe")
    public static HwDriveInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwDriveInstance.canInstantiate(obj))
        	return new HwDriveInstance(obj);
        else
        	throw new IllegalArgumentException("HwDriveInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("900f130b-f2e9-4613-9538-8150dbb393a4")
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
    @objid ("732caeeb-002e-4e0c-a4d8-cc2d30cd9bc0")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Instance_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b95beed4-1b52-46ba-9384-5aec88914cd2")
    public String getHwDrive_Instance_buffer() {
        return this.elt.getTagValue(HwDriveInstance.MdaTypes.HWDRIVE_INSTANCE_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Instance_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72fe4bf2-fc8a-4d78-95d9-4e9063f9db1c")
    public String getHwDrive_Instance_sectorSize() {
        return this.elt.getTagValue(HwDriveInstance.MdaTypes.HWDRIVE_INSTANCE_SECTORSIZE_TAGTYPE_ELT);
    }

    @objid ("a8aa049e-5cd7-458a-a2e1-27269e583e9f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Instance_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4854d337-765d-41f8-a6e3-0d497754f4b3")
    public void setHwDrive_Instance_buffer(final String value) {
        this.elt.putTagValue(HwDriveInstance.MdaTypes.HWDRIVE_INSTANCE_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Instance_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e380c00c-c0e0-4fdb-b9a3-478d11c4ce86")
    public void setHwDrive_Instance_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveInstance.MdaTypes.HWDRIVE_INSTANCE_SECTORSIZE_TAGTYPE_ELT, value);
    }

    @objid ("dab023ea-94cd-44f6-945e-3240200af038")
    protected HwDriveInstance(final Instance elt) {
        super(elt);
    }

    @objid ("76e6a70b-375a-4a32-9e71-0621fe1cd766")
    public static final class MdaTypes {
        @objid ("0268944c-d710-477b-b8fc-7dd1f492f1a1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3bbb56d5-bc6e-4f23-b7db-c2f4057fde78")
        public static TagType HWDRIVE_INSTANCE_SECTORSIZE_TAGTYPE_ELT;

        @objid ("36d0a5b8-544d-4e50-b9cf-4f66a9e8854f")
        public static TagType HWDRIVE_INSTANCE_BUFFER_TAGTYPE_ELT;

        @objid ("e80d9213-5dd8-4af2-9b78-1976c8a09643")
        private static Stereotype MDAASSOCDEP;

        @objid ("40833515-950d-4a39-a12c-c8f9c83f8dff")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("40feff34-9e85-437d-ba1d-780076bd65fa")
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
