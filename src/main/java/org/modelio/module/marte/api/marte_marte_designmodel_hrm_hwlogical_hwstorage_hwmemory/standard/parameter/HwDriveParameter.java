/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwDrive_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("595ca703-3993-4085-b5dc-243913c40a29")
public class HwDriveParameter extends HwMemoryParameter {
    @objid ("0f1dba66-c457-4ab6-8ebc-27de266222e2")
    public static final String STEREOTYPE_NAME = "HwDrive_Parameter";

    @objid ("d2a98143-63a0-4055-8034-d596c780cb99")
    public static final String HWDRIVE_PARAMETER_BUFFER_TAGTYPE = "HwDrive_Parameter_buffer";

    @objid ("58ab3505-6b32-45ce-ad3b-a474d1bfed9a")
    public static final String HWDRIVE_PARAMETER_SECTORSIZE_TAGTYPE = "HwDrive_Parameter_sectorSize";

    /**
     * Tells whether a {@link HwDriveParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwDrive_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5ee0f16d-3593-43e9-8108-3622edb54b45")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwDrive_Parameter >> then instantiate a {@link HwDriveParameter} proxy.
     * 
     * @return a {@link HwDriveParameter} proxy on the created {@link Parameter}.
     */
    @objid ("1d52a59b-0082-439c-b61b-5433514bfd89")
    public static HwDriveParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveParameter.STEREOTYPE_NAME);
        return HwDriveParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveParameter} proxy from a {@link Parameter} stereotyped << HwDrive_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwDriveParameter} proxy or <i>null</i>.
     */
    @objid ("4f07c0e7-d466-48ca-957b-cfa175e3d4d2")
    public static HwDriveParameter instantiate(final Parameter obj) {
        return HwDriveParameter.canInstantiate(obj) ? new HwDriveParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDriveParameter} proxy from a {@link Parameter} stereotyped << HwDrive_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwDriveParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("92a0ca05-6409-4336-8df4-90d272a439f5")
    public static HwDriveParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwDriveParameter.canInstantiate(obj))
        	return new HwDriveParameter(obj);
        else
        	throw new IllegalArgumentException("HwDriveParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d4775466-906a-4d99-9145-e9eccd1ffbf6")
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
        HwDriveParameter other = (HwDriveParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("eb759405-52a0-4283-8a79-d46a078a45d0")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Parameter_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("819bf614-e71b-4728-bd61-bfc4441ad54a")
    public String getHwDrive_Parameter_buffer() {
        return this.elt.getTagValue(HwDriveParameter.MdaTypes.HWDRIVE_PARAMETER_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Parameter_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53a47234-29ec-43de-97ba-d3e8b990c53a")
    public String getHwDrive_Parameter_sectorSize() {
        return this.elt.getTagValue(HwDriveParameter.MdaTypes.HWDRIVE_PARAMETER_SECTORSIZE_TAGTYPE_ELT);
    }

    @objid ("b46114c7-7ca3-4cb1-b309-59e09a1d7620")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Parameter_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ad05cfa2-ae1c-474c-a132-0c59c5358145")
    public void setHwDrive_Parameter_buffer(final String value) {
        this.elt.putTagValue(HwDriveParameter.MdaTypes.HWDRIVE_PARAMETER_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Parameter_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1d3ba350-4f50-4e76-ab4d-105c1d8997b9")
    public void setHwDrive_Parameter_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveParameter.MdaTypes.HWDRIVE_PARAMETER_SECTORSIZE_TAGTYPE_ELT, value);
    }

    @objid ("7bd1450c-8aed-4053-b01a-51e6fb372451")
    protected HwDriveParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("e2330b19-9f9a-4aef-a649-8b5a30232463")
    public static final class MdaTypes {
        @objid ("09d984e2-2629-4852-9af7-26f43a5547f7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2c17acf5-f183-4ddb-9b75-a47de0268677")
        public static TagType HWDRIVE_PARAMETER_SECTORSIZE_TAGTYPE_ELT;

        @objid ("77ca0ef6-e3dd-4169-ba62-83c716827d86")
        public static TagType HWDRIVE_PARAMETER_BUFFER_TAGTYPE_ELT;

        @objid ("66c0d971-3da1-406c-9ebb-fcf32c9afb84")
        private static Stereotype MDAASSOCDEP;

        @objid ("4149f402-b091-4129-838c-1531f959a273")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3353e7d1-9745-456b-af07-3857a0006896")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0169eebc-0ccf-11df-8525-001302895b2b");
            HWDRIVE_PARAMETER_SECTORSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "016eb356-0ccf-11df-8525-001302895b2b");
            HWDRIVE_PARAMETER_BUFFER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "016eb35d-0ccf-11df-8525-001302895b2b");
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
