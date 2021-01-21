/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("6983da71-a20f-4767-8a8c-e457d9b3bd96")
    public static final String STEREOTYPE_NAME = "Clock_Link";

    @objid ("52da5fdd-00ab-474f-a57e-79301b2d438c")
    public static final String CLOCK_LINK_STANDARD_TAGTYPE = "Clock_Link_standard";

    @objid ("2f3f32f1-e00e-4c5a-b64a-645113965b41")
    public static final String CLOCK_LINK_TYPE_TAGTYPE = "Clock_Link_type";

    @objid ("e02fb5b0-db0a-4441-8e49-223f8cfefdd8")
    public static final String CLOCK_LINK_UNIT_TAGTYPE = "Clock_Link_unit";

    /**
     * The underlying {@link Link} represented by this proxy, never null.
     */
    @objid ("aa5a7c2e-8e88-4141-a20c-b68a265d7ae0")
    protected final Link elt;

    /**
     * Tells whether a {@link ClockLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << Clock_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b9a2e330-9980-4c4e-95dd-4b01b23daee6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << Clock_Link >> then instantiate a {@link ClockLink} proxy.
     * 
     * @return a {@link ClockLink} proxy on the created {@link Link}.
     */
    @objid ("c6fe4945-d566-4315-bf9e-3354cb1e0e76")
    public static ClockLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockLink.STEREOTYPE_NAME);
        return ClockLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link ClockLink} proxy from a {@link Link} stereotyped << Clock_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link ClockLink} proxy or <i>null</i>.
     */
    @objid ("6582f040-7f21-4057-9ae1-27a9df7f01d7")
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
    @objid ("7a60d7e0-5136-45db-be52-d41d4a685e13")
    public static ClockLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (ClockLink.canInstantiate(obj))
        	return new ClockLink(obj);
        else
        	throw new IllegalArgumentException("ClockLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("41b8e49c-65d3-4e76-9cc8-be9e71bf2a01")
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
    @objid ("0fab1adc-6093-472f-9e6b-fab35cc6c9d0")
    public String getClock_Link_standard() {
        return this.elt.getTagValue(ClockLink.MdaTypes.CLOCK_LINK_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c895595-4095-4ba2-a386-1ecef32d05ff")
    public String getClock_Link_type() {
        return this.elt.getTagValue(ClockLink.MdaTypes.CLOCK_LINK_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Link_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("92d74c51-5913-4384-9319-fbf3c2c390a1")
    public String getClock_Link_unit() {
        return this.elt.getTagValue(ClockLink.MdaTypes.CLOCK_LINK_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("1fca97d5-97f8-4bdd-9f1a-672cf10eb6e6")
    public Link getElement() {
        return this.elt;
    }

    @objid ("aa5dfb2f-aec5-4cc0-a6e0-eccb54d0e832")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Link_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e7a9bb8-8817-468b-b36e-edf574cae12b")
    public void setClock_Link_standard(final String value) {
        this.elt.putTagValue(ClockLink.MdaTypes.CLOCK_LINK_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("629ae9cf-968b-44f3-badd-f2015a9a100f")
    public void setClock_Link_type(final String value) {
        this.elt.putTagValue(ClockLink.MdaTypes.CLOCK_LINK_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Link_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7725778a-fc8d-473b-90bc-f8c8ac10a31d")
    public void setClock_Link_unit(final String value) {
        this.elt.putTagValue(ClockLink.MdaTypes.CLOCK_LINK_UNIT_TAGTYPE_ELT, value);
    }

    @objid ("224cc9dd-38d3-4675-9f4e-2fa01b21aa3d")
    protected ClockLink(final Link elt) {
        this.elt = elt;
    }

    @objid ("8b0f48a6-a2f2-4e0f-b094-3f75e03bdd4a")
    public static final class MdaTypes {
        @objid ("f835c6fb-db02-444e-9018-2a52ddb12811")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("846f4982-2205-4078-8641-f25695d66695")
        public static TagType CLOCK_LINK_STANDARD_TAGTYPE_ELT;

        @objid ("2d49458b-335e-45a3-98c8-7c22325a2b87")
        public static TagType CLOCK_LINK_TYPE_TAGTYPE_ELT;

        @objid ("69b38157-f8af-4600-9168-7d5b7230fd63")
        public static TagType CLOCK_LINK_UNIT_TAGTYPE_ELT;

        @objid ("a9d9b10e-fd5e-4662-b7a3-485a7803e874")
        private static Stereotype MDAASSOCDEP;

        @objid ("daf8ae99-aaf3-4d5c-be6e-6d5d2178ce99")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4400948-d397-4639-9535-1353f1639654")
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
