/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter;

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
public class HwDriveParameter extends HwMemoryParameter {
    public static final String STEREOTYPE_NAME = "HwDrive_Parameter";

    public static final String HWDRIVE_PARAMETER_BUFFER_TAGTYPE = "HwDrive_Parameter_buffer";

    public static final String HWDRIVE_PARAMETER_SECTORSIZE_TAGTYPE = "HwDrive_Parameter_sectorSize";

    /**
     * Tells whether a {@link HwDriveParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwDrive_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwDrive_Parameter >> then instantiate a {@link HwDriveParameter} proxy.
     * 
     * @return a {@link HwDriveParameter} proxy on the created {@link Parameter}.
     */
    public static HwDriveParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveParameter.STEREOTYPE_NAME);
        return HwDriveParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveParameter} proxy from a {@link Parameter} stereotyped << HwDrive_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwDriveParameter} proxy or <i>null</i>.
     */
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
    public static HwDriveParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwDriveParameter.canInstantiate(obj))
        	return new HwDriveParameter(obj);
        else
        	throw new IllegalArgumentException("HwDriveParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwDriveParameter other = (HwDriveParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Parameter_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDrive_Parameter_buffer() {
        return this.elt.getTagValue(HwDriveParameter.MdaTypes.HWDRIVE_PARAMETER_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Parameter_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDrive_Parameter_sectorSize() {
        return this.elt.getTagValue(HwDriveParameter.MdaTypes.HWDRIVE_PARAMETER_SECTORSIZE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Parameter_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDrive_Parameter_buffer(final String value) {
        this.elt.putTagValue(HwDriveParameter.MdaTypes.HWDRIVE_PARAMETER_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Parameter_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDrive_Parameter_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveParameter.MdaTypes.HWDRIVE_PARAMETER_SECTORSIZE_TAGTYPE_ELT, value);
    }

    protected HwDriveParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDRIVE_PARAMETER_SECTORSIZE_TAGTYPE_ELT;

        public static TagType HWDRIVE_PARAMETER_BUFFER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
