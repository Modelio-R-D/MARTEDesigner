/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwI_O_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("629b2c5f-b37e-4d0f-b5b2-6963dfccf5fa")
public class HwIOAttribute extends HwDeviceAttribute {
    @objid ("7b1e6d9d-4b35-4030-a7f4-c3e0173ad543")
    public static final String STEREOTYPE_NAME = "HwI_O_Attribute";

    /**
     * Tells whether a {@link HwIOAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwI_O_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("85c54ebc-3651-4ae5-901c-7af1ac8eb99a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwIOAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwI_O_Attribute >> then instantiate a {@link HwIOAttribute} proxy.
     * 
     * @return a {@link HwIOAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("df59e8ce-665e-4e9f-9bcd-cdb4b622f71a")
    public static HwIOAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwIOAttribute.STEREOTYPE_NAME);
        return HwIOAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwIOAttribute} proxy from a {@link Attribute} stereotyped << HwI_O_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwIOAttribute} proxy or <i>null</i>.
     */
    @objid ("e3f1f77d-2db5-40b4-90c2-6f24ca19ad39")
    public static HwIOAttribute instantiate(final Attribute obj) {
        return HwIOAttribute.canInstantiate(obj) ? new HwIOAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwIOAttribute} proxy from a {@link Attribute} stereotyped << HwI_O_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwIOAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ca837b39-ae06-428a-ae42-4131f31d017c")
    public static HwIOAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwIOAttribute.canInstantiate(obj))
        	return new HwIOAttribute(obj);
        else
        	throw new IllegalArgumentException("HwIOAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2235fb90-d0f7-4624-9705-0d4f6f7a04b6")
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
        HwIOAttribute other = (HwIOAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("a9e4009f-d267-434f-8310-18219155545b")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("1b896c81-29ae-48fd-b409-e56f1f6e8004")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("86f0a932-388c-449e-8f18-22927c8af9e5")
    protected HwIOAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("2e17f25b-e585-4a34-86ea-845f3cd6510e")
    public static final class MdaTypes {
        @objid ("97dd216a-f3e0-48d1-b3be-6afcc532da0a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2fae9e4d-a6fc-46a4-862a-0fbe772eba76")
        private static Stereotype MDAASSOCDEP;

        @objid ("2345a8f0-ddb4-4c3c-9379-69b82c007c91")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4c75601-52e0-43b4-8ac1-817426690120")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0137ddf5-0ccf-11df-8525-001302895b2b");
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
