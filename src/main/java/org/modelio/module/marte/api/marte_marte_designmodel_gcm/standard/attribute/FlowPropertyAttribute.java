/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << FlowProperty_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("49f51565-9c59-4fa2-8098-5577ad3cec3e")
public class FlowPropertyAttribute {
    @objid ("964e8379-fbad-4872-bc16-ff4751804b97")
    public static final String STEREOTYPE_NAME = "FlowProperty_Attribute";

    @objid ("01203371-f1b8-477c-a00e-51c0a854d933")
    public static final String FLOWPROPERTY_ATTRIBUTE_DIRECTION_TAGTYPE = "FlowProperty_Attribute_direction";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("85a749bf-94cd-4172-97ca-36b24220bbb2")
    protected final Attribute elt;

    /**
     * Tells whether a {@link FlowPropertyAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << FlowProperty_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bb3b6f54-606c-4b1c-b6b5-a06e18da629e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << FlowProperty_Attribute >> then instantiate a {@link FlowPropertyAttribute} proxy.
     * 
     * @return a {@link FlowPropertyAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("c3080e93-d7f5-46d1-b2a2-2d74bdf51140")
    public static FlowPropertyAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyAttribute.STEREOTYPE_NAME);
        return FlowPropertyAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link FlowPropertyAttribute} proxy from a {@link Attribute} stereotyped << FlowProperty_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link FlowPropertyAttribute} proxy or <i>null</i>.
     */
    @objid ("962f5522-8118-41ce-9a1c-6ea65ba692cf")
    public static FlowPropertyAttribute instantiate(final Attribute obj) {
        return FlowPropertyAttribute.canInstantiate(obj) ? new FlowPropertyAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FlowPropertyAttribute} proxy from a {@link Attribute} stereotyped << FlowProperty_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link FlowPropertyAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e9cd349e-2b20-459b-9aaa-787638b9edbf")
    public static FlowPropertyAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (FlowPropertyAttribute.canInstantiate(obj))
        	return new FlowPropertyAttribute(obj);
        else
        	throw new IllegalArgumentException("FlowPropertyAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("540ab6ba-6286-4e2d-ab2d-8452753468a3")
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
        FlowPropertyAttribute other = (FlowPropertyAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("26afd742-785c-42d3-a90b-3519998adb53")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'FlowProperty_Attribute_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c85cf2d-c696-47d9-b9f7-fdd5cc1271ad")
    public String getFlowProperty_Attribute_direction() {
        return this.elt.getTagValue(FlowPropertyAttribute.MdaTypes.FLOWPROPERTY_ATTRIBUTE_DIRECTION_TAGTYPE_ELT);
    }

    @objid ("273126a5-d738-4eb0-8949-004d12c30b59")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'FlowProperty_Attribute_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("11c67551-0d12-4e29-84b5-73a0e82be4c6")
    public void setFlowProperty_Attribute_direction(final String value) {
        this.elt.putTagValue(FlowPropertyAttribute.MdaTypes.FLOWPROPERTY_ATTRIBUTE_DIRECTION_TAGTYPE_ELT, value);
    }

    @objid ("6769d253-63cd-410f-812c-6122ed49de9f")
    protected FlowPropertyAttribute(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("c4e57c30-5d00-4ac7-910c-1608f2b98266")
    public static final class MdaTypes {
        @objid ("a4636f06-fb54-4325-96ec-73539d7f680d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dce9ffd2-ce4e-436d-9977-0d2faf3cb7f8")
        public static TagType FLOWPROPERTY_ATTRIBUTE_DIRECTION_TAGTYPE_ELT;

        @objid ("6a085078-582f-47bd-8444-ac238282bd33")
        private static Stereotype MDAASSOCDEP;

        @objid ("bdbb296f-e2b2-4206-a2c5-d95afc57f567")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1b764997-4073-4d13-aebc-750f6fd8fec6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0247a678-0ccf-11df-8525-001302895b2b");
            FLOWPROPERTY_ATTRIBUTE_DIRECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0247a67b-0ccf-11df-8525-001302895b2b");
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
