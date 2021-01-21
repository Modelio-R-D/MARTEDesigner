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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link.GaExecHostLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SaExecHost_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8f93c9f6-1fb6-4a9d-8ab8-53efb02b2236")
public class SaExecHostLink extends GaExecHostLink {
    @objid ("483987c4-f1d9-4fdd-b4a6-f820bb49cb39")
    public static final String STEREOTYPE_NAME = "SaExecHost_Link";

    @objid ("3a65563a-99dd-443b-b8ac-54c3e9b35970")
    public static final String SAEXECHOST_LINK_ISRPRIORANGE_TAGTYPE = "SaExecHost_Link_ISRprioRange";

    @objid ("8876bcba-40ea-47a9-9f97-6c4ae80b9877")
    public static final String SAEXECHOST_LINK_ISRSWITCHT_TAGTYPE = "SaExecHost_Link_ISRswitchT";

    @objid ("f2c1fcc8-493f-4e10-9e20-0521c727ec29")
    public static final String SAEXECHOST_LINK_ISSCHED_TAGTYPE = "SaExecHost_Link_isSched";

    @objid ("6a237f62-7b85-4a15-bf6c-19d52e2a2368")
    public static final String SAEXECHOST_LINK_SCHSLACK_TAGTYPE = "SaExecHost_Link_schSlack";

    @objid ("cb68d4b6-a906-4de2-8f86-879760e4e25e")
    public static final String SAEXECHOST_LINK_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Link_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SaExecHost_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("570335a3-7088-4a9e-8fab-239e7b470f8a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SaExecHost_Link >> then instantiate a {@link SaExecHostLink} proxy.
     * 
     * @return a {@link SaExecHostLink} proxy on the created {@link Link}.
     */
    @objid ("30eb7626-9df5-49fd-be0f-17d1e08de6f0")
    public static SaExecHostLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostLink.STEREOTYPE_NAME);
        return SaExecHostLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostLink} proxy from a {@link Link} stereotyped << SaExecHost_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SaExecHostLink} proxy or <i>null</i>.
     */
    @objid ("2427dfe6-c76e-4b5e-8977-209838ccae7b")
    public static SaExecHostLink instantiate(final Link obj) {
        return SaExecHostLink.canInstantiate(obj) ? new SaExecHostLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostLink} proxy from a {@link Link} stereotyped << SaExecHost_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SaExecHostLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("54528f0c-2164-42c5-8881-9ab0fddeca47")
    public static SaExecHostLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SaExecHostLink.canInstantiate(obj))
        	return new SaExecHostLink(obj);
        else
        	throw new IllegalArgumentException("SaExecHostLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("100b1ffc-5b3f-4296-802b-320edc0b9795")
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
        SaExecHostLink other = (SaExecHostLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("630aa4f3-bd61-4b02-a21c-cd5eccdf26a0")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Link_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("976f539d-82cc-4da9-808f-c9063b3ab8cc")
    public String getSaExecHost_Link_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Link_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b6b613c-3076-4926-896b-5c803c644d17")
    public String getSaExecHost_Link_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Link_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2ffdc4f-b85f-408f-bc9b-b69ee874cde0")
    public String getSaExecHost_Link_schSlack() {
        return this.elt.getTagValue(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Link_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("144e8b8c-cb3e-49e4-b859-ef1c819844ed")
    public String getSaExecHost_Link_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("6c0c7776-45e0-433a-900f-995c88cc8bc1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Link_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("74df1c46-bca5-4576-af64-8f2aea03c630")
    public boolean isSaExecHost_Link_isSched() {
        return this.elt.isTagged(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Link_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("831c4a9e-3adc-4e83-bca8-08b278caf74a")
    public void setSaExecHost_Link_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Link_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d37acdff-6bf4-4fa2-9440-93a7e271e128")
    public void setSaExecHost_Link_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Link_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f4a846c-c789-4ee1-a72c-6f5d6488b4d2")
    public void setSaExecHost_Link_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Link_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc869e53-f26e-424a-92a4-46af61b9fc07")
    public void setSaExecHost_Link_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Link_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("56e3a169-671c-4936-9ef0-b56e33830072")
    public void setSaExecHost_Link_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostLink.MdaTypes.SAEXECHOST_LINK_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("c7db36fd-ea9b-48c5-a2d2-6064a08b4240")
    protected SaExecHostLink(final Link elt) {
        super(elt);
    }

    @objid ("1f75ae7f-5b6b-4b83-ac61-b03582667d9c")
    public static final class MdaTypes {
        @objid ("4c6f2688-6de0-4e94-8274-f358999f7e5c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6fbfad69-ea66-4992-8fee-70e506386f15")
        public static TagType SAEXECHOST_LINK_ISSCHED_TAGTYPE_ELT;

        @objid ("215cccf5-2fd2-4324-af28-bc5ddde6f4f4")
        public static TagType SAEXECHOST_LINK_SCHSLACK_TAGTYPE_ELT;

        @objid ("3967589c-1ed5-48df-a931-a369cd959525")
        public static TagType SAEXECHOST_LINK_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("0394917b-f7d8-4707-80cb-26d33e0ad1a0")
        public static TagType SAEXECHOST_LINK_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("30aec957-2e40-4e58-9408-23f35d45f051")
        public static TagType SAEXECHOST_LINK_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("b3aca042-81ad-47a5-87ba-c1f6a5e67f79")
        private static Stereotype MDAASSOCDEP;

        @objid ("9cb3c8e8-7c5c-430b-815b-41eeef8cefcc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("20758bdb-ca56-4013-b948-cc2750256bd3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03a156ed-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_LINK_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b93f-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_LINK_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b946-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_LINK_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b94d-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_LINK_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b954-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_LINK_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b95b-0ccf-11df-8525-001302895b2b");
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
