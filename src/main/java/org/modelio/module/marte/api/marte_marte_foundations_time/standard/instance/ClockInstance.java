/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << Clock_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("550564a6-8f33-4c46-9bd7-990c8f6bd1c5")
public class ClockInstance {
    @objid ("f80fa6d4-0f9b-40e2-a5bb-79a1641d2827")
    public static final String STEREOTYPE_NAME = "Clock_Instance";

    @objid ("d9f2e711-c699-4e98-968e-ad9aa0df8cf0")
    public static final String CLOCK_INSTANCE_STANDARD_TAGTYPE = "Clock_Instance_standard";

    @objid ("f4f246e6-89d3-471f-beca-17b78939b0f2")
    public static final String CLOCK_INSTANCE_TYPE_TAGTYPE = "Clock_Instance_type";

    @objid ("b4b35a93-8ba7-4a72-8f57-300fb808fec5")
    public static final String CLOCK_INSTANCE_UNIT_TAGTYPE = "Clock_Instance_unit";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    @objid ("3dba4e18-0534-471a-9369-4446000708be")
    protected final Instance elt;

    /**
     * Tells whether a {@link ClockInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Clock_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0f86759c-4c5f-4a37-b76c-4e6173dfdbb4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Clock_Instance >> then instantiate a {@link ClockInstance} proxy.
     * 
     * @return a {@link ClockInstance} proxy on the created {@link Instance}.
     */
    @objid ("d06876d1-1f91-474c-b060-b39572b5af22")
    public static ClockInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockInstance.STEREOTYPE_NAME);
        return ClockInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ClockInstance} proxy from a {@link Instance} stereotyped << Clock_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ClockInstance} proxy or <i>null</i>.
     */
    @objid ("230b81c4-3eae-4679-9e27-f3734524c45d")
    public static ClockInstance instantiate(final Instance obj) {
        return ClockInstance.canInstantiate(obj) ? new ClockInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockInstance} proxy from a {@link Instance} stereotyped << Clock_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ClockInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("192f498a-e049-4fbf-9f6c-5ffd900097bf")
    public static ClockInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ClockInstance.canInstantiate(obj))
        	return new ClockInstance(obj);
        else
        	throw new IllegalArgumentException("ClockInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a4de6aae-6fcf-4758-a0e5-517070e000eb")
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
        ClockInstance other = (ClockInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_Instance_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b933c09e-b598-43d9-bbf5-e09b417aa01c")
    public String getClock_Instance_standard() {
        return this.elt.getTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("35455169-919c-4266-98ef-5bddff94b37e")
    public String getClock_Instance_type() {
        return this.elt.getTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Instance_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ff4e6cc1-60f6-4f72-9247-f604cbfb5b1a")
    public String getClock_Instance_unit() {
        return this.elt.getTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("f864ca7a-2778-4d7d-a11c-dff9819c5b7a")
    public Instance getElement() {
        return this.elt;
    }

    @objid ("9aec5e51-76b0-459a-af48-251a1172f32b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Instance_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8673f2e5-fca8-4e52-ac87-1d4c6828136e")
    public void setClock_Instance_standard(final String value) {
        this.elt.putTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa041573-9d8f-4659-a280-48279eae0254")
    public void setClock_Instance_type(final String value) {
        this.elt.putTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Instance_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53c67c76-062b-488e-ab67-afb5209b2d45")
    public void setClock_Instance_unit(final String value) {
        this.elt.putTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_UNIT_TAGTYPE_ELT, value);
    }

    @objid ("4fb67aef-ad81-4482-a7c8-bed438d611c6")
    protected ClockInstance(final Instance elt) {
        this.elt = elt;
    }

    @objid ("1178685a-7311-41d8-b5b7-938242e9d416")
    public static final class MdaTypes {
        @objid ("ba1075fa-cc7f-4ab0-975e-797b9ce61854")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64ec5882-0cba-443c-96cc-b89ce8d99924")
        public static TagType CLOCK_INSTANCE_STANDARD_TAGTYPE_ELT;

        @objid ("9dfa9e00-6e01-4ba7-9e07-c0bd469479dd")
        public static TagType CLOCK_INSTANCE_TYPE_TAGTYPE_ELT;

        @objid ("fed06e9e-5fce-46ec-8feb-4ff74101e12b")
        public static TagType CLOCK_INSTANCE_UNIT_TAGTYPE_ELT;

        @objid ("e1d726e2-88f3-46f8-be76-e5f45a840fc7")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ef7d147-5712-47c3-a21b-110bcfe6fd1e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f526c21-b5b3-4f03-9a7e-3404db017a88")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "df95dcf2-14cd-11df-9d54-0014222a9f79");
            CLOCK_INSTANCE_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "df95dcf3-14cd-11df-9d54-0014222a9f79");
            CLOCK_INSTANCE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "df95dcf4-14cd-11df-9d54-0014222a9f79");
            CLOCK_INSTANCE_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "df95dcf5-14cd-11df-9d54-0014222a9f79");
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
