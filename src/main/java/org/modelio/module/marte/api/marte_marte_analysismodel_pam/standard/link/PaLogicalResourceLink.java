/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.link;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << PaLogicalResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f85d6f73-bdbd-4fa6-86d9-dba962a3861a")
public class PaLogicalResourceLink extends ResourceLink {
    @objid ("d89a2f98-1493-479b-b906-5055c34c4240")
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Link";

    @objid ("caf00ec0-7470-4546-b29e-270d7bdd5251")
    public static final String PALOGICALRESOURCE_LINK_POOLSIZE_TAGTYPE = "PaLogicalResource_Link_poolSize";

    @objid ("4310d315-c393-43ed-8046-0eccccdf7596")
    public static final String PALOGICALRESOURCE_LINK_THROUGHPUT_TAGTYPE = "PaLogicalResource_Link_throughput";

    @objid ("912b79a6-02ee-4987-a41b-0ebec61b9b81")
    public static final String PALOGICALRESOURCE_LINK_UTILIZATION_TAGTYPE = "PaLogicalResource_Link_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << PaLogicalResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a406deca-eca8-4d8a-b8f1-0283912e384f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << PaLogicalResource_Link >> then instantiate a {@link PaLogicalResourceLink} proxy.
     * 
     * @return a {@link PaLogicalResourceLink} proxy on the created {@link Link}.
     */
    @objid ("052fa7ec-6df0-432b-92e6-cc7c0d4b308b")
    public static PaLogicalResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceLink.STEREOTYPE_NAME);
        return PaLogicalResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceLink} proxy from a {@link Link} stereotyped << PaLogicalResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link PaLogicalResourceLink} proxy or <i>null</i>.
     */
    @objid ("4accc35d-9420-4571-a768-ed5de26f5f92")
    public static PaLogicalResourceLink instantiate(final Link obj) {
        return PaLogicalResourceLink.canInstantiate(obj) ? new PaLogicalResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceLink} proxy from a {@link Link} stereotyped << PaLogicalResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link PaLogicalResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cd1ede97-ff8c-4450-89e4-63da9e0513b0")
    public static PaLogicalResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (PaLogicalResourceLink.canInstantiate(obj))
        	return new PaLogicalResourceLink(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("940c364a-8997-49ec-b5f0-5205105b9947")
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
        PaLogicalResourceLink other = (PaLogicalResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("d173f728-e2de-43f7-a198-45baaa156f33")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'PaLogicalResource_Link_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f5526d41-af2a-4008-9d10-104ffebcd9af")
    public String getPaLogicalResource_Link_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb1c76b7-5644-48fd-ac65-292dca94a1c9")
    public String getPaLogicalResource_Link_throughput() {
        return this.elt.getTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("348863a2-620f-4a24-9600-c4b5531820fd")
    public String getPaLogicalResource_Link_utilization() {
        return this.elt.getTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("7f400a6e-2ba6-46d0-8fa0-bd94b9b31212")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Link_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d563451-6805-4e19-8d6e-e32b0f1b34f9")
    public void setPaLogicalResource_Link_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("546acb73-78e5-4794-9684-7783cb7c38ac")
    public void setPaLogicalResource_Link_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6f059b55-cb17-4e62-9803-fe5a067fd793")
    public void setPaLogicalResource_Link_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("bbead3ad-cb6a-40dd-984b-9467a9114a50")
    protected PaLogicalResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("3e038347-71e8-4bdb-bd5b-f7d59ead17f1")
    public static final class MdaTypes {
        @objid ("6fe4339e-2800-47ae-83e1-8e71a25af0d7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("083e05b3-c6df-4bdd-888e-38a03bbeefff")
        public static TagType PALOGICALRESOURCE_LINK_UTILIZATION_TAGTYPE_ELT;

        @objid ("b23e976b-55d1-4c68-9d85-de9983c0a3ed")
        public static TagType PALOGICALRESOURCE_LINK_THROUGHPUT_TAGTYPE_ELT;

        @objid ("891085f1-efe3-4310-8544-7c38d9079480")
        public static TagType PALOGICALRESOURCE_LINK_POOLSIZE_TAGTYPE_ELT;

        @objid ("d1fc0be0-9479-4aa9-95de-c612f0dcf397")
        private static Stereotype MDAASSOCDEP;

        @objid ("6dc5d325-fdb0-4dc4-8e9e-bb87c6c5bee1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88226867-a65d-403d-90aa-261750d94746")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d10556-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_LINK_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d1055d-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_LINK_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367a3-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_LINK_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367aa-0ccf-11df-8525-001302895b2b");
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
