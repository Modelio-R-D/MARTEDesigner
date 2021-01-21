/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.link;

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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link.GaCommHostLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SaCommHost_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c1ac5b03-3596-4a89-8c48-dc7789b5864b")
public class SaCommHostLink extends GaCommHostLink {
    @objid ("8710e599-0deb-4b25-8594-e6924e151b63")
    public static final String STEREOTYPE_NAME = "SaCommHost_Link";

    @objid ("3eca17b1-61fb-441f-b2c7-811e7c1c53f4")
    public static final String SACOMMHOST_LINK_ISSCHED_TAGTYPE = "SaCommHost_Link_isSched";

    @objid ("7111a1a3-51ff-437e-905f-ebd2ed2803ae")
    public static final String SACOMMHOST_LINK_SCHSLACK_TAGTYPE = "SaCommHost_Link_schSlack";

    /**
     * Tells whether a {@link SaCommHostLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SaCommHost_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9ad2f29e-f2d2-468b-90eb-e8060ec182e0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SaCommHost_Link >> then instantiate a {@link SaCommHostLink} proxy.
     * 
     * @return a {@link SaCommHostLink} proxy on the created {@link Link}.
     */
    @objid ("0ad17ff1-3108-478d-b246-9f354249e8a3")
    public static SaCommHostLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostLink.STEREOTYPE_NAME);
        return SaCommHostLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostLink} proxy from a {@link Link} stereotyped << SaCommHost_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SaCommHostLink} proxy or <i>null</i>.
     */
    @objid ("671e02f8-8daf-47a7-91d3-0af5f1b50b08")
    public static SaCommHostLink instantiate(final Link obj) {
        return SaCommHostLink.canInstantiate(obj) ? new SaCommHostLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostLink} proxy from a {@link Link} stereotyped << SaCommHost_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SaCommHostLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3ed349dd-c1ad-4bac-bc26-180b523fa947")
    public static SaCommHostLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SaCommHostLink.canInstantiate(obj))
        	return new SaCommHostLink(obj);
        else
        	throw new IllegalArgumentException("SaCommHostLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6100b1f5-89e1-4da6-9778-e0940f271635")
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
        SaCommHostLink other = (SaCommHostLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("4d463dbe-fdf2-4759-874e-b767dd09ce8b")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_Link_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0fc7db7f-63a2-41e6-bd74-e625f5c4f2a6")
    public String getSaCommHost_Link_schSlack() {
        return this.elt.getTagValue(SaCommHostLink.MdaTypes.SACOMMHOST_LINK_SCHSLACK_TAGTYPE_ELT);
    }

    @objid ("3e54c10a-4232-4cb9-b580-54d5457b2efc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Link_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75c30cf3-0a0c-44e0-ab36-d94ba9605d76")
    public boolean isSaCommHost_Link_isSched() {
        return this.elt.isTagged(SaCommHostLink.MdaTypes.SACOMMHOST_LINK_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Link_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("08f2c7a2-cdfa-4d04-b6bf-21125a98e50d")
    public void setSaCommHost_Link_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostLink.MdaTypes.SACOMMHOST_LINK_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostLink.MdaTypes.SACOMMHOST_LINK_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Link_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2dabde27-e05b-48eb-8f80-caf94f9048e0")
    public void setSaCommHost_Link_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostLink.MdaTypes.SACOMMHOST_LINK_SCHSLACK_TAGTYPE_ELT, value);
    }

    @objid ("6b834db9-62dd-458b-87f5-515a64e96f30")
    protected SaCommHostLink(final Link elt) {
        super(elt);
    }

    @objid ("e9b1e2e2-af61-4d1c-b9c4-fc6f76ea040e")
    public static final class MdaTypes {
        @objid ("a09bc3bc-0f04-4ee1-97d8-a7d6839a9b51")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ce7c757c-67e1-454f-b7c9-66cea0a53334")
        public static TagType SACOMMHOST_LINK_ISSCHED_TAGTYPE_ELT;

        @objid ("1fb59fae-cc8c-41b3-9f59-2b51d7c50f9a")
        public static TagType SACOMMHOST_LINK_SCHSLACK_TAGTYPE_ELT;

        @objid ("e423f8dc-8650-4801-b6ef-fa5b30d74303")
        private static Stereotype MDAASSOCDEP;

        @objid ("1bcef7fc-008e-45d0-82eb-8f5b6384730e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7206e91-7b91-41e4-a8d7-1cfe724022d4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "039c9249-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_LINK_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9250-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_LINK_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9257-0ccf-11df-8525-001302895b2b");
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
