/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << Clock_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1a47ff18-cb69-4d8e-a6b8-198d88e02767")
public class ClockLink {
    @objid ("ab9b4ca8-5a17-4726-afbd-c87fa8e08c96")
    public static final String STEREOTYPE_NAME = "Clock_Link";

    @objid ("a603a9d9-a3de-4b2e-8144-7dfc0b33fb2d")
    public static final String CLOCK_LINK_STANDARD_TAGTYPE = "Clock_Link_standard";

    @objid ("7c7fd9ba-dca5-49ec-8fff-8b8cd317bceb")
    public static final String CLOCK_LINK_TYPE_TAGTYPE = "Clock_Link_type";

    @objid ("9ff2777f-5e19-46f1-a29c-22ccd6bc4604")
    public static final String CLOCK_LINK_UNIT_TAGTYPE = "Clock_Link_unit";

    /**
     * The underlying {@link Link} represented by this proxy, never null.
     */
    @objid ("77df5ba9-c45d-4605-928a-f761c7a5321c")
    protected final Link elt;

    /**
     * Tells whether a {@link ClockLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << Clock_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f80a8f32-4e47-4656-b6b3-a8f575e28a26")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << Clock_Link >> then instantiate a {@link ClockLink} proxy.
     * 
     * @return a {@link ClockLink} proxy on the created {@link Link}.
     */
    @objid ("34a5846e-7e25-4d5b-a589-d4d728bfe010")
    public static ClockLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockLink.STEREOTYPE_NAME);
        return ClockLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link ClockLink} proxy from a {@link Link} stereotyped << Clock_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link ClockLink} proxy or <i>null</i>.
     */
    @objid ("48bb363a-4c37-45f3-950f-6b8e3a120cf4")
    public static ClockLink instantiate(final Link obj) {
        return ClockLink.canInstantiate(obj) ? new ClockLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockLink} proxy from a {@link Link} stereotyped << Clock_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link ClockLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d351d716-00cb-4ccb-bd96-b31f3ed6b59d")
    public static ClockLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (ClockLink.canInstantiate(obj))
        	return new ClockLink(obj);
        else
        	throw new IllegalArgumentException("ClockLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d6770eb2-e75e-4e63-b93d-9f7d3f9f466c")
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
        ClockLink other = (ClockLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_Link_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4f79d64-f049-40b7-b359-177ac9e4d7d4")
    public String getClock_Link_standard() {
        return this.elt.getTagValue(ClockLink.MdaTypes.CLOCK_LINK_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("89d8468e-9721-447d-8522-839dc4995dee")
    public String getClock_Link_type() {
        return this.elt.getTagValue(ClockLink.MdaTypes.CLOCK_LINK_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Link_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("117a19bc-110b-406f-a3b8-44c168b92709")
    public String getClock_Link_unit() {
        return this.elt.getTagValue(ClockLink.MdaTypes.CLOCK_LINK_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("6b143abf-e635-47c1-aeac-ea2881b17ed7")
    public Link getElement() {
        return this.elt;
    }

    @objid ("2d181646-510a-4ce6-b990-da16916b653b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Link_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ec6a800f-cf61-47e1-a747-9b81fc2dba64")
    public void setClock_Link_standard(final String value) {
        this.elt.putTagValue(ClockLink.MdaTypes.CLOCK_LINK_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e98b7fd-2bc1-4c6a-80b5-7c2044d08bf3")
    public void setClock_Link_type(final String value) {
        this.elt.putTagValue(ClockLink.MdaTypes.CLOCK_LINK_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Link_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afcaf5ae-0397-47bd-bad2-c8bcddb1e807")
    public void setClock_Link_unit(final String value) {
        this.elt.putTagValue(ClockLink.MdaTypes.CLOCK_LINK_UNIT_TAGTYPE_ELT, value);
    }

    @objid ("80fee9a1-e162-4dc2-aafa-dd7e57b00574")
    protected ClockLink(final Link elt) {
        this.elt = elt;
    }

    @objid ("8b0f48a6-a2f2-4e0f-b094-3f75e03bdd4a")
    public static final class MdaTypes {
        @objid ("636ddde6-e5bf-46dc-8f87-0eaef9811186")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("92f5e903-5c55-4bd5-89bc-b265a45b889e")
        public static TagType CLOCK_LINK_STANDARD_TAGTYPE_ELT;

        @objid ("d7aeb006-8300-40d1-9ddb-91cc6d0d4eab")
        public static TagType CLOCK_LINK_TYPE_TAGTYPE_ELT;

        @objid ("680827e2-4ca9-41a5-8c37-5ee22e95a458")
        public static TagType CLOCK_LINK_UNIT_TAGTYPE_ELT;

        @objid ("452ba0ad-543c-45ac-8558-71eda1929e8c")
        private static Stereotype MDAASSOCDEP;

        @objid ("e268f4ce-067f-4290-8976-729a12e2a808")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac0de1c1-e56d-4b44-80af-087cee498a6e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dfdb017b-14cd-11df-9d54-0014222a9f79");
            CLOCK_LINK_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfdb017c-14cd-11df-9d54-0014222a9f79");
            CLOCK_LINK_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfdb017d-14cd-11df-9d54-0014222a9f79");
            CLOCK_LINK_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfdb017e-14cd-11df-9d54-0014222a9f79");
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
