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
 * Proxy class to handle a {@link Parameter} with << HwROM_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("830c9a0d-1ba8-4f71-bc43-e011d42bca91")
public class HwROMParameter extends HwMemoryParameter {
    @objid ("a98ea05a-ee10-4f98-b397-e26ced91c48f")
    public static final String STEREOTYPE_NAME = "HwROM_Parameter";

    @objid ("e01cd0c6-dd34-4b7f-9f9d-b1b1b49e9b88")
    public static final String HWROM_PARAMETER_ORGANIZATION_TAGTYPE = "HwROM_Parameter_organization";

    @objid ("785e1dac-7899-4413-996b-c356d5876e77")
    public static final String HWROM_PARAMETER_TYPE_TAGTYPE = "HwROM_Parameter_type";

    /**
     * Tells whether a {@link HwROMParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwROM_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4dde3d39-f765-4e35-bdf2-690c0b2cdef5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwROM_Parameter >> then instantiate a {@link HwROMParameter} proxy.
     * 
     * @return a {@link HwROMParameter} proxy on the created {@link Parameter}.
     */
    @objid ("483f8ddb-6f4d-4f86-9117-c5d8e139ecaf")
    public static HwROMParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMParameter.STEREOTYPE_NAME);
        return HwROMParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwROMParameter} proxy from a {@link Parameter} stereotyped << HwROM_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwROMParameter} proxy or <i>null</i>.
     */
    @objid ("6ce4148c-3fd2-4687-9646-b9bd210da132")
    public static HwROMParameter instantiate(final Parameter obj) {
        return HwROMParameter.canInstantiate(obj) ? new HwROMParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwROMParameter} proxy from a {@link Parameter} stereotyped << HwROM_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwROMParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2fa0708f-60b5-4daf-bfd0-bc65e5e2dd7b")
    public static HwROMParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwROMParameter.canInstantiate(obj))
        	return new HwROMParameter(obj);
        else
        	throw new IllegalArgumentException("HwROMParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ee1e362-a287-48ff-9711-232b4fc51c5d")
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
        HwROMParameter other = (HwROMParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("2f0b934e-aec7-47ba-bfda-688c92e17d22")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Parameter_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6549b2c2-292e-4805-9a1b-6d782d848efe")
    public String getHwROM_Parameter_organization() {
        return this.elt.getTagValue(HwROMParameter.MdaTypes.HWROM_PARAMETER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f44d6fd-6d56-4234-b260-c3851ca128d8")
    public String getHwROM_Parameter_type() {
        return this.elt.getTagValue(HwROMParameter.MdaTypes.HWROM_PARAMETER_TYPE_TAGTYPE_ELT);
    }

    @objid ("a2726150-1eb2-4c86-a6ae-d55d359ef2a4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Parameter_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("918ea985-36eb-4b0c-8d23-48f895d44875")
    public void setHwROM_Parameter_organization(final String value) {
        this.elt.putTagValue(HwROMParameter.MdaTypes.HWROM_PARAMETER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6babb5de-2025-4093-b4c2-a4b508f7d047")
    public void setHwROM_Parameter_type(final String value) {
        this.elt.putTagValue(HwROMParameter.MdaTypes.HWROM_PARAMETER_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("ca75336d-f416-4886-9923-a5befc0b1209")
    protected HwROMParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("c063b4bb-f02f-4d39-a013-dfe02f6b5c95")
    public static final class MdaTypes {
        @objid ("66385b85-f352-458b-8942-3990caa311f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("08a4125e-41ca-4155-b6eb-da9d59107407")
        public static TagType HWROM_PARAMETER_TYPE_TAGTYPE_ELT;

        @objid ("44c97dc6-d354-441e-825f-2058c54d025b")
        public static TagType HWROM_PARAMETER_ORGANIZATION_TAGTYPE_ELT;

        @objid ("d0bcd321-511e-464f-9346-6ce79bb4134e")
        private static Stereotype MDAASSOCDEP;

        @objid ("f38cc562-68d0-49ee-80cd-021bb59c5a2b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dacaf114-09fa-4321-8a64-fcff66a285c7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0169eead-0ccf-11df-8525-001302895b2b");
            HWROM_PARAMETER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0169eeb4-0ccf-11df-8525-001302895b2b");
            HWROM_PARAMETER_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0169eebb-0ccf-11df-8525-001302895b2b");
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
